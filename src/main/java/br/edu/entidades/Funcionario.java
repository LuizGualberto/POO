/*
 * Tabela pessoa 
 */
package br.edu.entidades;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;



@Entity
@Table(name="funcionario")
public class Funcionario {

        @Id
	@GeneratedValue
	private Integer id;
        
        @Column(length=60, nullable=false)
	private String nome;

	@Column (length=20, nullable=false)
        private int telefone;
        
        @Column (length=30, nullable=false)
        @Temporal(javax.persistence.TemporalType.DATE)
        private Date dataNascimento;
        
        @Column (length=30, nullable=false)
        private String Funcao;
        
        @Column (length=13, nullable=false)
        private Integer cpf;
        
        @Column (length=30, nullable=false)
        private Integer rg;
        
        @Column (length=30, nullable=false)
        private String email;
        
        @Column (length=30, nullable=false)
        private String rua;
        
        @Column (length=15, nullable=false)
        private String cidade;
        
        @Column (length=20, nullable=false)
        private String bairro;
        
        @Column (length=10, nullable=false)
        private int numero;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the Funcao
     */
    public String getFuncao() {
        return Funcao;
    }

    /**
     * @param Funcao the Funcao to set
     */
    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    /**
     * @return the cpf
     */
    public Integer getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public Integer getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(Integer rg) {
        this.rg = rg;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

   
        
}