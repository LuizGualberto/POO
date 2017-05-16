/**
 * Tabela Despesas
 * PauloFeitosa
 */
package br.edu.entidades;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;


@Entity
@Table(name="despesas")
public class Despesas {

          
     @Id
     @GeneratedValue
     private Integer id;
     
     @Column (length=50, nullable=false)
     private String descri��o;
     
     @Column (length=15, nullable=false)
     private float valor;
     
     @Column (length=30, nullable=false)
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date data;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descri��o
     */
    public String getDescri��o() {
        return descri��o;
    }

    /**
     * @param descri��o the descri��o to set
     */
    public void setDescri��o(String descri��o) {
        this.descri��o = descri��o;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

  
    
}
