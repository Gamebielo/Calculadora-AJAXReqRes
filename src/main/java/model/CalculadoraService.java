package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.HibernateException;

/**
 *
 * @author Gamebielo
 */

public class CalculadoraService { //persistence class
    
	public List<ModelCalculadora> list(Integer codUsuario){
            System.out.println("COD USUARIO NO SERVICE: "+codUsuario);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
            EntityManager em = emf.createEntityManager();

            List<ModelCalculadora> calc = null;
            Query query = em.createQuery("FROM calculadora c where cod_usuario=:codigo"); 
            query.setParameter("codigo", codUsuario);
            calc = query.getResultList();
            em.close();
            emf.close();
            return calc;          
	}
	
}