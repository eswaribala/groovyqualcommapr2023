<%--
  Created by IntelliJ IDEA.
  User: Balasubramaniam
  Date: 20/04/2023
  Time: 12:20
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="Customer"/></a></li>
    </ul>

</div>
<div>
<table border="1">
    <tr>
        <td>
            First Name
        </td>
        <td>
            Award Points
        </td>
        <td>
            Order No
        </td>

    </tr>
    <g:each in="${data}" var="thisCustomer">
        <tr>
            <td>
                ${thisCustomer[0]}
            </td>
            <td>
                ${thisCustomer[1]}
            </td>
            <td>
                ${thisCustomer[2]}
            </td>
        </tr>
    </g:each>
</table>
</div>
</body>
</html>