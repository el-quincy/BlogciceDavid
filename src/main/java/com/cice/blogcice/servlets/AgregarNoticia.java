package com.cice.blogcice.servlets;

import com.cice.blogcice.dao.Noticia;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet("/AgregarNoticia")
public class AgregarNoticia extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Noticia noticia=null;
        noticia.setTitulo(request.getParameter("titulo"));
        noticia.setIdNoticia(request.getParameter("noticia"));

        /*Mirar a ver cómo controlo el nº de noticias que hay para en caso de pasar
        * de 3, hacer 2 líneas.
        * También tengo que ver cómo inserto la noticia en la BD.
        */

        PrintWriter salida=new PrintWriter(System.out);
        salida.print(noticia);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/nuevanoticia.jsp");
        dispatcher.forward(request, response);
    }
}
