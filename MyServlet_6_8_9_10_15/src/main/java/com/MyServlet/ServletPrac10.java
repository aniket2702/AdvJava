package com.MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletPrac10 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	
    	
        PrintWriter out = response.getWriter();
                int birth_date = Integer.valueOf(request.getParameter("txt1"));
                int birth_month = Integer.valueOf(request.getParameter("txt2"));
                int birth_year = Integer.valueOf(request.getParameter("txt3"));
    
                // present date
                int current_date = 2;
                int current_month = 5;
                int current_year = 2022;
        
               
            		 int month[] = { 31, 28, 31, 30, 31, 30, 31,
                             31, 30, 31, 30, 31 };

            // if birth date is greater then current
            // birth_month, then donot count this month
            // and add 30 to the date so as to subtract
            // the date and get the remaining days
            if (birth_date > current_date) {
            	current_month = current_month - 1;
            	current_date = current_date + month[birth_month - 1];
            }
            	

            // if birth month exceeds current month,
            // then do not count this year and add
            // 12 to the month so that we can subtract
            // and find out the difference
            if (birth_month > current_month) {
            	current_year = current_year - 1;
            	current_month = current_month + 12;
            }

            // calculate date, month, year
            int calculated_date = current_date - birth_date;
            int calculated_month = current_month - birth_month;
            int calculated_year = current_year - birth_year;

            // print the present age

            out.println("Present Age ");
            out.println("Years = "+calculated_year);
            out.println("Month = "+calculated_month);
            out.println("Days = "+calculated_date);
            		
            	}
    }

	

