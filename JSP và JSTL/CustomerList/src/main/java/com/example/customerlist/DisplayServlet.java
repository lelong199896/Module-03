package com.example.customerlist;

import com.sun.net.httpserver.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/customer")
public class DisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội","image"));
        customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang","image"));
        customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định","image"));
        customers.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây","image"));
        customers.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội","image"));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
        req.setAttribute("customer", customers);
        requestDispatcher.forward(req, resp);
    }
}
