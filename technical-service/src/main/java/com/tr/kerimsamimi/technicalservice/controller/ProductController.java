package com.tr.kerimsamimi.technicalservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.tr.kerimsamimi.technicalservice.mapper.MapperKerim;
import com.tr.kerimsamimi.technicalservice.model.Customer;
import com.tr.kerimsamimi.technicalservice.model.CustomerDemand;
import com.tr.kerimsamimi.technicalservice.model.Product;
import com.tr.kerimsamimi.technicalservice.model.ProductDto;
import com.tr.kerimsamimi.technicalservice.request.AddProductMaintananceRequest;
import com.tr.kerimsamimi.technicalservice.service.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController{

	private static final String PRODUCT_REPAIR_STATUS_IN_PROGRESS = "IN_PROGRESS";
	
	@Autowired
	MapperKerim mapperK;
	
	@Autowired
	private ProductService productService;
	

	@PostMapping(path="/add-product")
	public ModelAndView addProduct(@ModelAttribute Product product) {
		
		productService.addProduct(product);
		int custId=product.getCustomer().getCustomerNo();
		System.out.println(custId);
		return new ModelAndView("redirect:getAllProducts/"+custId);
		
	}
	
	@RequestMapping(path="/productForm")
	public ModelAndView getProductForm(@ModelAttribute(value="customer") Customer customer) {
		
		ProductDto product=new ProductDto();
		product.setCustomer(customer);
		return null;
	}
	
	private CustomerDemand getCustomerDemand(AddProductMaintananceRequest request) {
		CustomerDemand customerDemand = new CustomerDemand();
		customerDemand.setChangedPart(request.getChangedPart());
		customerDemand.setDisType(request.getDiscussionType());
		customerDemand.setMaintananceDate(request.getMaintananceDate());
		customerDemand.setProduct(mapperK.convertProductFromDTO(request.getProduct()));
		customerDemand.setStatus(PRODUCT_REPAIR_STATUS_IN_PROGRESS);
		return customerDemand;
	}
	
		//talepte bulundugu urunlerin durumunu gosteren
		@RequestMapping(path="/getProduct/{productId}",method=RequestMethod.GET)
		public Optional<Product> getProductById(@PathVariable Integer productId) {
			return productService.getProductById(productId);
		}
		
		@RequestMapping(path="/getAllProducts/{customerId}",method=RequestMethod.GET)
		public ModelAndView getAllProductsByCustomerId(@PathVariable(value="customerId") Integer custId){
			List<Product> products=productService.getAllProducts(custId);
			return new ModelAndView("Product_List","products",products);
			
		}
		
		@RequestMapping(path="/repair/{no}",method=RequestMethod.GET)
		public ModelAndView repairProduct(@ModelAttribute(value="no") Integer product) {
			System.out.println("tamir edildi");
			return new ModelAndView("Repair_List","product",product);
		}

}
