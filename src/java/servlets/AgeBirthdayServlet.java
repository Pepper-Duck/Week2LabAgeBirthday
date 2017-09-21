package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeBirthdayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeBirthdayJSP.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String age = request.getParameter("Age");
        
        System.out.println(age);
        if(age.matches("[ a-zA-Z_.,!\"'/$]+")){
            request.setAttribute("errMsg", "Enter only Numbers.");
        }else if(age.length() > 0){
            request.setAttribute("Age", " Your Age next Birthday will be "+ (Integer.parseInt(age)+1));
        }else{
            request.setAttribute("errMsg", "Enter your current Age.");
        }       
       getServletContext().getRequestDispatcher("/WEB-INF/AgeBirthdayJSP.jsp").forward(request,response);
    }
 }
