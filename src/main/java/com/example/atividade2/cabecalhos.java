package com.example.atividade2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cabecalhos")
public class cabecalhos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>Exercício 2.b</title></head>");
        out.println("<body>");
        out.println("<p>Host: " + req.getHeader("Host") + "</p>");
        out.println("<p>User-agent: " + req.getHeader("User-Agent") + "</p>");
        out.println("<p>Accept enconding: " + req.getHeader("Accept-Encoding")+ "</p>");
        out.println("<p>Accept language: " + req.getHeader("Accept-Language") + "</p>");
        out.println("</body>");
        out.println("</html");
    }
}
