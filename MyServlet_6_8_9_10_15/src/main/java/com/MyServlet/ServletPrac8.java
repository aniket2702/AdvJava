package com.MyServlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletPrac8 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
                String n1 = request.getParameter("txt1");
                String n2 = request.getParameter("txt2");
                String n3 = request.getParameter("txt3");
                String n4 = request.getParameter("txt4");
                                
        
                out.println("Name = "+n1);
                out.println("Age = "+Integer.parseInt(n2));
                out.println("Email = "+n3);
                out.println("Phone Number = "+n4);
   
        
    }
}
