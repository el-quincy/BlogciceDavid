<%--
  Created by IntelliJ IDEA.
  User: David
  Date: 15/04/2019
  Time: 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nueva noticia</title>
</head>
<body>
    <form action="/AgregarNoticia" method=post">
        Título:<br>
        <input type="text" name="titulo" >
        <br>
        com.cice.blogcice.dao.Noticia:<br>
        <input type="text" name="noticia" >
        <br><br>
        <input type="submit" value="Agregar noticia">
    </form>
</body>
</html>
