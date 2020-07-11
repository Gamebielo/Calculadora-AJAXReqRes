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

@Entity(name="calculadora") // Nome da tabela no BD
public class ModelCalculadora { //persistence class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informa ao framework a estratégia de geração do ID ('automática')
    private long id;           //persistence attribute

    @Column(name="conta_efetuada")
    private  String contaEfetuada;       //persistence attribute

    @Column(name="horario_efetuado")
    private  String horarioEfetuado;       //persistence attribute

    @Column(name="cod_usuario")
    private  int codUsuario;

    public ModelCalculadora(){}          //zero parameter constructor

    // GETTERS & SETTERS

    public String getHorarioEfetuado() {   
        return horarioEfetuado;
    }
    public void setHorarioEfetuado(String horarioEfetuado) {
        this.horarioEfetuado = horarioEfetuado;
    }
    public String getContaEfetuada() {   
        return contaEfetuada;
    }
    public void setContaEfetuada(String contaEfetuada) {
        this.contaEfetuada = contaEfetuada;
    }
    public int getCodUsuario(){
        return codUsuario;
    }
    public void setCodUsuario(int codUsuario){
        this.codUsuario = codUsuario;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}