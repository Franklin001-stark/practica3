
package com.emergentes.controlador;

import com.emergentes.modelo.registro3;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesa3", urlPatterns = {"/procesa3"})
public class procesa3 extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String titulo =request.getParameter("titulo");
       String autor =request.getParameter("autor");
       String resumen =request.getParameter("resumen");
       String medio =request.getParameter("medio");
       
    registro3 regi = new registro3();

    regi.setTitulo(titulo);
    regi.setAutor(autor);
    regi.setResumen(resumen);
    regi.setMedio(medio);
    
    request.setAttribute("miregi", regi);
   
    request.getRequestDispatcher("salida3.jsp").forward(request, response);
}
}  