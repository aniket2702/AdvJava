package com.MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletPrac15 extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
                Integer n1 = Integer.valueOf(request.getParameter("txt1"));
                String op = request.getParameter("op");                
        switch (op) {
            case "Prime":
          	  int i,m=0,flag=0;      
        	  m=n1/2;      
        	  if(n1==0||n1==1){  
        	   out.println(n1+" is not prime number");      
        	  }else{  
        	   for(i=2;i<=m;i++){      
        	    if(n1%i==0){      
        	    	out.println(n1+" is not prime number");      
        	     flag=1;      
        	     break;      
        	    }      
        	   }      
        	   if(flag==0)  { out.println(n1+" is prime number"); }  
        	  }//end of else
                break;
            case "Armstrong":
            	int originalNumber, remainder, result = 0, n = 0;

                originalNumber = n1;

                for (;originalNumber != 0; originalNumber /= 10, ++n);

                originalNumber = n1;

                for (;originalNumber != 0; originalNumber /= 10)
                {
                    remainder = originalNumber % 10;
                    result += Math.pow(remainder, n);
                }

                if(result == n1)
                	out.println(n1 + " is an Armstrong number.");
                else
                	out.println(n1 + " is not an Armstrong number.");
                break;
            case "Even":
                if(n1 % 2 == 0)
                	out.println(n1 + " is even");
                else
                	out.println(n1 + " is odd");
                break;
            default:
                out.println("OOPS....Something went wrong..!! ");
                break;
        } 
        
    } 
}
