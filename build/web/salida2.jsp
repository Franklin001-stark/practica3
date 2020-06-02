
<%@page import="com.emergentes.modelo.registro2"%>
<%
    registro2 item = (registro2)request.getAttribute("miregi");
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
            <li>Producto: <%= item.getProducto() %></li>
             <li>Categoria:<%= item.getCategoria() %></li>
              <li>Existencia: <%= item.getExistencia() %></li>
              <li>Precio: <%= item.getPrecio() %></li>
        </ul>
        <a href="productos.jsp">Volver a inscripcion</a>
        <br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
