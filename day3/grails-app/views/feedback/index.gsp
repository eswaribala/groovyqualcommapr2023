<%--
  Created by IntelliJ IDEA.
  User: Balasubramaniam
  Date: 19/04/2023
  Time: 16:33
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
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
  <g:form >
      <fieldset>
       <g:render template="form"></g:render>
      </fieldset>
      <fieldset>
          <g:submitButton name="submit" value="submit" class="save"></g:submitButton>
      </fieldset>
  </g:form>
</div>
</body>
</html>