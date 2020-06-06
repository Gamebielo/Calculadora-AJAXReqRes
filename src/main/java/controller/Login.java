package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author gamebielo
 */

@WebServlet(name = "Login", urlPatterns={"/login"})
public class Login extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            req.getRequestDispatcher("/jsp/login.jsp").forward(req, res);
        } catch(Exception e){
            System.out.println("Erro");
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        username = username.toUpperCase();
        
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        //HttpSession session= req.getSession();   // Iniciando a session para armazenar algumas informações
        //session.setAttribute("uname", username); // Armazenando o username
        req.setAttribute("user_name", username);
        try{
            //req.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);
            res.sendRedirect(req.getContextPath() + "/calculadora");
        } catch(Exception e){
            System.out.println("Erro");
        }
        
    }
}