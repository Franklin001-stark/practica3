
<%@page import="com.emergentes.modelo.registro3"%>
<%
    registro3 item = (registro3)request.getAttribute("miregi");
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>datos recibidos</h1>
        <p>los datos recibidos son:</p>
        <ul>
            <li>Titulo: <%= item.getTitulo() %></li>
             <li>Autor:<%= item.getAutor() %></li>
              <li>Resumen: <%= item.getResumen() %></li>
              <li>Medio: <%= item.getMedio() %></li>
        </ul>
        <a href="libros.jsp">Volver a inscripcion</a>
        <br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
