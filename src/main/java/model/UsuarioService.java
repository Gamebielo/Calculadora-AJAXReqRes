package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.HibernateException;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Gamebielo
 */

public class UsuarioService { //persistence class
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");        
    EntityManager em = emf.createEntityManager();

	public List<ModelUsuario> list(){
            List<ModelUsuario> calc = null;
            Query query = em.createQuery("FROM calculadora c"); 
            calc = query.getResultList();
            em.close();
            emf.close();
            return calc;            
	}

    public long login(String nome, String senha){
        Query query = em.createQuery("FROM usuario u where login=:login"); 
        query.setParameter("login", nome);
        List<ModelUsuario> usuarios = query.getResultList();
        if (usuarios.isEmpty()){
            System.out.println("Esta vazia!");
        }
        else{
            for(ModelUsuario ui: usuarios){
                if (ui.getSenha().equals(senha)){
                    return ui.getId();
                }
                else{
                    return 0;
                }
            } 
        }
        return 0;
    }

    // Return the name (user)
    public String username(long id){
        Query query = em.createQuery("FROM usuario u where id=:id"); 
        query.setParameter("id", id);
        List<ModelUsuario> usuarios = query.getResultList();
        if (usuarios.isEmpty()){
            System.out.println("Esta vazia!");
        }
        else{
            for(ModelUsuario ui: usuarios){
                if (ui.getId() == id){
                    return ui.getNomeUsuario();
                }
                else{
                    return "";
                }
            } 
        }
        return "";
    }
}