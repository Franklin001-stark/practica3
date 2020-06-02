
package com.emergentes.controlador;

import com.emergentes.modelo.registro2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "procesa2", urlPatterns = {"/procesa2"})
public class procesa2 extends HttpServlet {

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String producto =request.getParameter("producto");
       String categoria =request.getParameter("categoria");
      int existencia = Integer.parseInt(request.getParameter("existencia"));
       int precio = Integer.parseInt(request.getParameter("precio"));
       
       
    registro2 regi = new registro2();

    regi.setProducto(producto);
    regi.setCategoria(categoria);
    regi.setExistencia(existencia);
    regi.setPrecio(precio);
    
    request.setAttribute("miregi", regi);
   
    request.getRequestDispatcher("salida2.jsp").forward(request, response);
}
}  