package controller;




import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.ModelCalculadora;


@WebServlet(urlPatterns = {"/calcular"})
public class Calcular extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        try{
            String svalorA = req.getParameter("numeroA");
            String svalorB = req.getParameter("numeroB");
            String operacao = req.getParameter("operacao");
            
            Double resultado = 0.0;
            Double n1;
            Double n2;

            n1 = Double.parseDouble(svalorA);
            n2 = Double.parseDouble(svalorB);

            if(operacao.equals("+")){
                resultado = n1 + n2;
            } else if (operacao.equals("-")){
                resultado = n1 - n2;
            } else if (operacao.equals("*")){
                resultado = n1 * n2;
            } else if (operacao.equals("/")){
                resultado = n1 / n2;
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
            EntityManager em = emf.createEntityManager();
        
            /* Criação de uma entidade - CREATE */        
            ModelCalculadora modelCalc = new ModelCalculadora();
            modelCalc.setContaEfetuada(svalorA+" "+operacao+" "+svalorB+" = "+resultado.toString());
            em.getTransaction().begin();
            em.persist(modelCalc);
            em.getTransaction().commit();
            
        		
		    res.setContentType("text/plain");
		    res.getWriter().write(resultado.toString());
            //res.getWriter().write(numero2);
        }
        catch(Exception e){
            System.out.println("Ocorreu o seguinte erro ao entrar: "+e);            
        }        
    } 
}