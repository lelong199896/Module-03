package com.example.product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Calculator")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double price = Float.parseFloat(req.getParameter("Price"));
        double percent = Float.parseFloat(req.getParameter("DiscountPercent"));
        double discountAmount = price * percent * 0.01;
        double discountPrice = price - discountAmount;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("Discount Amount: " + discountAmount + " VND<br>");
        writer.println("Discount Price: " + discountPrice + " VND");
        writer.println("</html>");
    }
}
