package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ModelCalculadora;
import model.CalculadoraService;
import java.util.List;

/**
 * @author gamebielo
 */

@WebServlet(urlPatterns={"/historico"})
public class Historico extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
    	try{
            CalculadoraService servCalc = new CalculadoraService();
		    List<ModelCalculadora> registros = servCalc.list();		

		    req.setAttribute("registros", registros);
            req.getRequestDispatcher("/jsp/historico.jsp").forward(req, res);

        } catch(Exception e){
            System.out.println("Erro");
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        //
    }
}