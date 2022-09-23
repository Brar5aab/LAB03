
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.commons.lang3.math.NumberUtils;


public class agecalculatorservlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher( "/WEB-INF/agecalculator.jsp").forward(request, response);
        return;  // important stop the code call

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String age = request.getParameter("enter_your_age");
        
        
        if ( age == null || age.equals("") )
        {
       //String message = "Please enter age it cannot be null";
       request.setAttribute("message","Please enter age it cannot be null");
       getServletContext().getRequestDispatcher( "/WEB-INF/agecalculator.jsp").forward(request, response);
       return;  // important stop the code call
       }
        
       try {
        int val = Integer.parseInt(age)+1;
        //String message = "your age next bday will be" + val;
       request.setAttribute("message","your age next bday will be "+ val);
       getServletContext().getRequestDispatcher( "/WEB-INF/agecalculator.jsp").forward(request, response);
        return;  // important stop the code call
        
        
    } catch (NumberFormatException e) {
        //String message = "Please enter age it cannot be string";
       request.setAttribute("message","Please enter age it cannot be string");
       getServletContext().getRequestDispatcher( "/WEB-INF/agecalculator.jsp").forward(request, response);
       return;  // important stop the code call
    }
    
     
      
        
        
    }

 

}
