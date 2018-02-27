<%-- 
    Document   : prodDetail
    Created on : Feb 20, 2018, 7:27:09 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Detail</title>
    </head>
    <body>
        <h1>Product Detail</h1>
         <table>
                    <tr>
                        <td>Product Name</td>
                        <td><c:out value="${product.prodName}"/></td>
                    </tr>
                    <tr>
                        <td>Product Price</td>
                        <td><c:out value="${product.price}"/></td>
                    </tr>
                    <tr>
                        <td>Quantity</td>
                        <td><c:out value="${product.prodDetails.qty}"/></td>
                    </tr>
                    <tr>
                        <td>Short Description</td>
                        <td><c:out value="${product.prodDetail.prodDetails}"/></td>
                    </tr>
                    
                </table>
    </body>
</html>
