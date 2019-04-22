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
<title>${customer.customerName}</title>
</head>

<body>

	<div class="container">
		<h2>Müşteri Servis Ekranı</h2>
		<h4>${customer.customerName}</h4>


		<div class="form-group">
		<form:form modelAttribute="customer" action="/customer/productForm" method="post">			
			<form:hidden path="customerNo" value="${customer.customerNo}"/>
			<form:hidden path="customerName" value="${customer.customerName}"/>
		<button type="submit" id="postCustomer" class="btn btn-default"
				>Ürün Ekle</button>
				
				</form:form>
		</div>


		
		

	</div>


</body>
</html>
