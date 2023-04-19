<%--
  Created by IntelliJ IDEA.
  User: Balasubramaniam
  Date: 19/04/2023
  Time: 16:33
--%>

<%@ page import="day3.Feedback" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="Feedback Form"></g:set>

    <title>Feedback Form</title>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
    </ul>

</div>
<div>
  <h1><g:message code="Feedback Form"></g:message></h1>
  <g:form method="POST" action="index">
      <fieldset class="form">
       <g:render template="form" model="[feedback: Feedback]"></g:render>
      </fieldset>
      <fieldset class="buttons">
          <g:submitButton name="displayForm" value="Submit" class="save"></g:submitButton>
          <input  type="button" name="displayForm" value="Reset" class="reset"></input>
      </fieldset>
  </g:form>
</div>
</body>
</html>