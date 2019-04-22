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
    
    
</head>
<body class=".container-fluid" >
<div class="container myrow-container" >
    <div class="panel panel-warning">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>Ürün Listele</b> </div>
                <div align="right"><a href="newProduct">Ürün Ekle</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty products}">
                <c:out value="Kayıt yok"></c:out>
            </c:if>
            <c:if test="${not empty products}">   
            
            	   	
            	            	
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #F2F5A9;">
                    <tr>
                        <th>SerialNo</th>
                        <th>Title</th>
                      
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${products}" var="prdct">
                        <tr>
                        
                        	<th><c:out value="${prdct.serialNo}"/></th>
                        	<th><c:out value="${prdct.productTitle}"/></th>                        	
                        	<th><a href="editProduct?musteriId=<c:out value='${prdct.no}'/>">Düzenle</a></th>
                        	<th><a href="deleteProduct?musteriId=<c:out value='${prdct.no}'/>">Sil</a></th>                         	
                        	<th><a href="/product/repair/<c:out value='${prdct.no}'/>">Tamir Et</a></th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
 </div>   
   

</body>
</html>