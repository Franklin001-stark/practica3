
package com.emergentes.controlador;

import com.emergentes.modelo.Registro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

  
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String nombre =request.getParameter("nombre");
       String apellidos =request.getParameter("apellidos");
       String curso =request.getParameter("curso");
       
    Registro regi = new Registro();

    regi.setNombre(nombre);
    regi.setApellidos(apellidos);
    regi.setCurso(curso);
    
    request.setAttribute("miregi", regi);
   
    request.getRequestDispatcher("salida.jsp").forward(request, response);
}
}
