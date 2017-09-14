package com.myserv.classes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Sit on 12.09.2017.
 */
@WebServlet("/helloworld")
public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("username");
        String age = req.getParameter("age");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("Hello from servlet");
        out.println("<p> Username is " + userName + "</p>");
        out.println("<p> User age is " + age + "</p>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String age = req.getParameter("age");

        PrintWriter out = resp.getWriter();
        out.print("answer is: " + userName + ", " + age);
    }

}
