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
    
	public List<ModelCalculadora> list(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
            EntityManager em = emf.createEntityManager();

            List<ModelCalculadora> calc = null;
            Query query = em.createQuery("FROM calculadora c"); 
            calc = query.getResultList();
            em.close();
            emf.close();
            return calc;            
	}
	
}