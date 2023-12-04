package com.example.demo5;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "HelloServlet", urlPatterns = "/helloservlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println("<html><body>");
        res.getWriter().println("this is HelloServlet ~~~");
        res.getWriter().println("</body></html>");
    }
}
