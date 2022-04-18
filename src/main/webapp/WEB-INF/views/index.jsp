<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18/04/2022
  Time: 8:47 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <form action="/translate" method="post">
    <lable>Word</lable>
    <input type="text" name="word">
    <input type="submit" value="Translate">
  </form>
  </body>
</html>
