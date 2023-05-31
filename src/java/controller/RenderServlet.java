package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Laptop;
import model.Student;

/**
 *
 * @author theva
 */
public class RenderServlet extends HttpServlet {

    
   
        

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/first.jsp").forward(request, response);
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Laptop l = new Laptop("Apple");
        Student s =new Student("Bob","Tom",l);
        request.setAttribute("student", s);
        request.setAttribute("message", false);
         getServletContext().getRequestDispatcher("/WEB-INF/second.jsp").forward(request, response);
        
        
    }

}
