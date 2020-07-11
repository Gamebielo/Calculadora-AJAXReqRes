package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.Math;

/**
 * @author Gamebielo
 */

@WebServlet(name = "Calculadora", urlPatterns={"/calculadora"})
public class Calculadora extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
    	try{
            HttpSession session = req.getSession(false);

            if((session != null) && ((String)session.getAttribute("username") != null)) {
                req.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);
            } else{
                res.sendRedirect(req.getContextPath() + "/login");
            }
        } catch(Exception e){
            System.out.println("Erro");
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        try{
            //req.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);
            //res.sendRedirect(req.getContextPath() + "/historico");
        } catch(Exception e){
            System.out.println("Erro");
        }
    }
}