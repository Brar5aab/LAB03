/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class arithmeticcalculatorservlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           request.setAttribute("m" , "---");
          getServletContext().getRequestDispatcher( "/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return; 
      
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String fno = request.getParameter("first_number");
         String sno = request.getParameter("second_number");
         request.setAttribute("fno", fno);
         request.setAttribute("sno", sno);
         String operation = request.getParameter("operation");

if ( fno == null || fno.equals("") || sno == null || sno.equals("") )
        {
       request.setAttribute("m","Please enter no it cannot be null");
       getServletContext().getRequestDispatcher( "/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
       return;  
       }         
       
try {
        int f = Integer.parseInt(fno);
        int s = Integer.parseInt(sno);
       if (operation.equals("+"))
                request.setAttribute("m", f + s);
            else if (operation.equals("-"))
                request.setAttribute("m", f - s);
            else if (operation.equals("*"))
                request.setAttribute("m", f * s);
            else
                request.setAttribute("m", f % s);
        getServletContext().getRequestDispatcher( "/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           
        return;  
        
        
    } catch (NumberFormatException e) {
       request.setAttribute("m","Please enter number it cannot be string");
        getServletContext().getRequestDispatcher( "/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
       return;  
    }
       
   
    }
}
