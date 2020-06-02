
package com.emergentes.controlador;

import com.emergentes.modelo.Registro1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "procesa", urlPatterns = {"/procesa"})
public class procesa extends HttpServlet {

  
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String nombre =request.getParameter("nombre");
       String apellidos =request.getParameter("apellidos");
       String correo =request.getParameter("correo");
       String contraceña =request.getParameter("contraceña");
       
       
    Registro1 regi = new Registro1();

    regi.setNombre(nombre);
    regi.setApellidos(apellidos);
    regi.setCorreo(correo);
    regi.setContraceña(contraceña);
    
    request.setAttribute("miregi", regi);
   
    request.getRequestDispatcher("salida1.jsp").forward(request, response);
}
}  