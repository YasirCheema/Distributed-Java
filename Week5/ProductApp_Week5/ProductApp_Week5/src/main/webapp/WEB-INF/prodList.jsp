<%-- 
    Document   : prodList
    Created on : Feb 20, 2018, 7:23:55 PM
    Author     : Dell
--%>
<%@page import="java.util.List"%>
<%@page import="edu.wctc.ycheema.productapp_week5.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
    </head>
    <body>
        <table>
                    <c:forEach var="prod" items="${prodList}">
			
			<tr>
                            <td><c:out value="${prod.prodName}"/></td>
				<td>
     <a href="?id=<c:out value="${prod.id}"/>"><c:out value="${prod.price}" /></a>
				</td>
			</tr>
                    </c:forEach>
			
		</table>
    </body>
</html>
