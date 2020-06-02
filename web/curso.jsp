<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .s{
                text-align: center;
               margin: 0 auto;
               
                                 
                  width: 20%;
                  transition: 2s;
                  margin-top: 20px;
                  box-shadow: 0px 0px 30px #66ff00, 0px 0px 40px #66ff33, 0px 0px 80px white;
                  background-color: rgba(0,0,0,0);
                  
            }
            .r{
                 text-align: center;
            }
        </style>
    </head>
    <body>
        <h1 class="r">Inscripcion en curso</h1>
        <form action="ProcesaServlet" method="post">
            <table class="s">
                <tr>
                    <td><label>Nombre</label> </td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td><label>Apellidos</label></td>
                    <td><input type="text" name="apellidos">
            </td>
                </tr>
                <tr>
                    <td> <label>Curso</label></td>
                    <td> <select name="curso" >
                <option>primero</option>
                <option>segundo</option>
                <option>tercero</option>
                <option>cuarto</option>
                <option>quinto</option>
                 <option>sexto</option>                               

            </select></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enviar"></td>
                </tr>
            </table>
            
        </form>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
