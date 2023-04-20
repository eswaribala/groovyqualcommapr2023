<%--
  Created by IntelliJ IDEA.
  User: Balasubramaniam
  Date: 20/04/2023
  Time: 11:50
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
</body>
</html>