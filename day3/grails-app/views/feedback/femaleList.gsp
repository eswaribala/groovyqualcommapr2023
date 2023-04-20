<%--
  Created by IntelliJ IDEA.
  User: Balasubramaniam
  Date: 20/04/2023
  Time: 11:50
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
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="Feedback"/></a></li>
    </ul>

</div>
<div>
<table border="1">
    <tr>
        <td>
           First Name
        </td>
        <td>
            Comments
        </td>
        <td>
          Gender
        </td>
    </tr>
    <g:each in="${resultData}" var="thisFeedback">
        <tr>
            <td>
                ${thisFeedback.getFirstName()}
            </td>
            <td>
                ${thisFeedback.getComments()}
            </td>
            <td>
                ${thisFeedback.getGender()}
            </td>
        </tr>
    </g:each>
</table>
</div>
</body>
</html>