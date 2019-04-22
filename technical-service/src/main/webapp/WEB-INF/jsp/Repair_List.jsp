<%--
  User: Kerim Samimi
  Date: 22/04/2019
  Time: 10:56 PM
  --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="Kerim Samimi">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${products[0].customer.customerName}</title>
    <!-- Bootstrap CSS -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>    
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
    
    <title>Tamir Ekranı</title>
</head>
<body>

      
		
		<div class="container">
		<h2>Ürün Tamir Ekranı</h2>
		<div class="alert alert-warning">
		 <br>
			<c:out value="${product} no'lu ürün tamir edilmiştir"></c:out>
		</div>
	</div>

		
		


</body>
</html>