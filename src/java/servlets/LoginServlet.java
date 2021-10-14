/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;
/**
 *
 * @author 849961
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user=(User)session.getAttribute("user");
        String message = "";
        if (request.getParameterMap().containsKey("logout")) {
            message = "You have successfully logged out.";
            request.setAttribute("message", message);
            session.setAttribute("user",null);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }else if  (user!=null){
            response.sendRedirect("home");
            return;
        }else {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        AccountService accountService = new AccountService();
        
        User user = accountService.login(username, password);
        session.setAttribute("user",user);
        if (user == null) {
            request.setAttribute("message", "invalid input");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }else {
            response.sendRedirect("home");
            return;
        }
    }
}