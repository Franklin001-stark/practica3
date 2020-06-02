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
        <h1 class="r">Registro de libros</h1>
        <form action="procesa3" method="post">
            <table class="s">
                <tr>
                    <td><label>Titulo</label> </td>
                    <td><input type="text" name="titulo"></td>
                </tr>
                <tr>
                    <td><label>Autor</label></td>
                    <td><input type="text" name="autor">
                        
            </td>
                </tr>
                <tr>
                    <td><label>Resumen</label></td>
                    <td>
                        <textarea type="text" name="resumen"></textarea>
            </td>
                </tr>
                <tr>
                    <td><label>Medio</label></td>
                    <td><input type="radio" name="medio" value="fisico">Fisico
                        <br>  <input type="radio" name="medio" value="magnetico">Magnetico
            
                    </td>
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
