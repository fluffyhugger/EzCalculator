<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sirapob
  Date: 30/10/2023 AD
  Time: 01:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1> Multiplication Table</h1>
  <c:forEach var="i" begin="1" end="12">
      <div>
          <span>${number}</span>
          <span>x</span>
          <span>${i}</span>
          <span>=</span>
          <span>${number * i}</span>
      </div>
  </c:forEach>
</body>
</html>
