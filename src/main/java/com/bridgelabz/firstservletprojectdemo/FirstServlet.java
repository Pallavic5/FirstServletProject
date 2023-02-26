package com.bridgelabz.firstservletprojectdemo;
/*UC1 - Problem Statement : Create my First Servlet*/

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet annotation is used to define a servlet component in a web application.
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    //doGet method  Called by the server (via the service method) to allow a servlet to handle a GET request.
    @Override
    protected void doGet (HttpServletRequest request,HttpServletResponse response) throws  ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h3>Hello World,I am Pallavi this is my First Servlet!</h3>");
        out.close();
    }
}
