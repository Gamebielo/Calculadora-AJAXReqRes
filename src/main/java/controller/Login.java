package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ModelUsuario;
import model.UsuarioService;

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
        try{
            UsuarioService us = new UsuarioService();
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            Long codUsuarioLogado = us.login(username, password);
            String name_user = us.username(codUsuarioLogado);
            if (codUsuarioLogado > 0){
                    HttpSession session = req.getSession();  
                    session.setAttribute("username", name_user);
                    session.setAttribute("codUsuario", Long.toString(codUsuarioLogado));
                    req.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);
                }else{
                    req.getRequestDispatcher("/jsp/login.jsp").forward(req, res);
                }
        } catch(Exception e){
            System.out.println("Erro: " + e);
        }
        
    }
}