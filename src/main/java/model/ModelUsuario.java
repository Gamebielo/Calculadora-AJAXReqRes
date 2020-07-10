package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gamebielo
 */

@Entity(name="usuario")
public class ModelUsuario { //persistence class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;           //persistence attribute

    @Column(name="nome_usuario")
    private String nomeUsuario;       //persistence attribute

    @Column(name="login")
    private String loginUsuario;       //persistence attribute

    @Column(name="senha")
    private String senha;

    public ModelUsuario(){}          //zero parameter constructor

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNomeUsuario() {   
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLoginUsuario() {   
        return loginUsuario;
    }
    public void setLoginUsuario(String nomeUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}