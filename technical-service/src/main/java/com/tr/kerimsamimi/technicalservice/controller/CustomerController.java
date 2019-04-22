package com.tr.kerimsamimi.technicalservice.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tr.kerimsamimi.technicalservice.model.Customer;
import com.tr.kerimsamimi.technicalservice.model.ProductDto;
import com.tr.kerimsamimi.technicalservice.service.CustomerService;

@RestController
@RequestMapping(path="/customer")
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(path="/createCustomer",method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	
	
	@RequestMapping(path="/getCustomer/{customerId}",method=RequestMethod.GET)
	public Optional<Customer> getCustomerById(@PathVariable Integer customerId) {
		return customerService.findCustomerByNo(customerId);
	}
	
	@RequestMapping(path="/getAllCustomer",method=RequestMethod.GET)
	public ModelAndView getAllCustomers(){
		Iterable<Customer> allCustomers=customerService.ListAllCustomer();
		try {
		System.out.println(allCustomers.iterator().next());
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		return new ModelAndView("Customer_List", "allCustomers", allCustomers);
	}
	
	
	@RequestMapping(path="/getCustDetails/{customerId}",method=RequestMethod.GET)
	public ModelAndView getCustDetailsGet(@PathVariable(value="customerId") Integer custId) {		
		Customer customer=new Customer();
		customer=customerService.findCustomerByNo(custId).get();
		return new ModelAndView("Customer_Details","customer",customer);
	}
	
	
	
	@RequestMapping(path="/productForm",method=RequestMethod.POST)
	public ModelAndView getCustDetailsPost(@ModelAttribute(value="customer") Customer customer) {
		System.out.println(customer.getCustomerName());
		ProductDto product=new ProductDto();
		product.setCustomer(customer);
		return new ModelAndView("Product_Form","product",product);
	}
	
	
}
