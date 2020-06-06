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

@WebServlet(name = "Calculadora", urlPatterns={"/calculadora"})
public class Calculadora extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
    	try{
            req.getRequestDispatcher("/jsp/calculadora.jsp").forward(req, res);
        } catch(Exception e){
            System.out.println("Erro");
        }
        HttpSession session= req.getSession();
        String name = (String) session.getAttribute("uname");
        System.out.println(name);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        //
    }
}