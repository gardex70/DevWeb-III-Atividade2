package com.example.atividade1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/requisicao")
public class requisicao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>Exercício 2.a</title></head>");
        out.println("<body>");
        out.println("<p>Método: " + req.getMethod() + "</p>");
        out.println("<p>URI do pedido: " + req.getRequestURI() + "</p>");
        out.println("<p>Protocolo: " + req.getProtocol() + "</p>");
        out.println("<p>Endereço remoto: " + req.getRemoteAddr() + "</p>");
        out.println("</body>");
        out.println("</html");
    }
}
