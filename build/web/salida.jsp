
<%@page import="com.emergentes.modelo.Registro"%>
<%
    Registro item = (Registro)request.getAttribute("miregi");
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
            <li>Nombre: <%= item.getNombre() %></li>
             <li>Apellidos:<%= item.getApellidos() %></li>
              <li>Curso: <%= item.getCurso() %></li>
        </ul>
        <a href="curso.jsp">Volver a inscripcion</a><br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
