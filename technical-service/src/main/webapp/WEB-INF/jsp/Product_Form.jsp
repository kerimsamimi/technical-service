<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>${product.customer.customerName}</title>
</head>

<body>

	<div class="container">
		<h2>Ürün Ekle</h2>
		<form:form id="UrunRegisterForm" modelAttribute="product"
			method="post" action="/product/add-product">
			
			<form:hidden path="customer.customerNo" value="${product.customer.customerNo}"/>
			 

			<div class="form-group">
				<form:label for="productTitle" path="productTitle">Product Title :</form:label>
				<form:input type="text" class="form-control" path="productTitle"
					id="productTitle" placeholder="Product Title" name="productTitle"
					value="${product.productTitle}" />
			</div>


			<div class="form-group">
				<form:label for="serialNo" path="serialNo">Serial No :</form:label>
				<form:input type="text" class="form-control" path="serialNo"
					id="serialNo" placeholder="Serial No" name="serialNo"
					value="${product.serialNo}" />
			</div>



			<button type="submit" id="saveProduct" class="btn btn-default"
				>Kaydet</button>

		</form:form>
	</div>


</body>
</html>
