<%--
  Created by IntelliJ IDEA.
  User: Balasubramaniam
  Date: 19/04/2023
  Time: 12:19
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<table border="1">
    <tr>
        <td>
            Id
        </td>
        <td>
            Name
        </td>
        <td>
            Cost
        </td>
    </tr>
<g:each in="${allProducts}" var="thisProduct">
    <tr>
        <td>
            ${thisProduct.getProductId()}
        </td>
        <td>
            ${thisProduct.getProductName()}
        </td>
        <td>
            ${thisProduct.getCost()}
        </td>
    </tr>
</g:each>
</table>
</body>
</html>