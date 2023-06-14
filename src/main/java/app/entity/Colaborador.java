
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela COLABORADOR
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"COLABORADOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Colaborador")
public class Colaborador implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cpf;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataNasc", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataNasc;


    /**
    * @generated
    */
    @Column(name = "endereco", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String endereco;


    /**
    * @generated
    */
    @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String telefone;


    /**
    * @generated
    */
    @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_cargo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Cargo cargo;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataAdmissao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataAdmissao;


    /**
    * @generated
    */
    @Column(name = "salarioBaseMaisSalarioCargo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal salarioBaseMaisSalarioCargo;


    /**
    * Construtor
    * @generated
    */
    public Colaborador(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Colaborador setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Colaborador setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém cpf
    * return cpf
    * @generated
    */
    public java.lang.String getCpf() {
        return this.cpf;
    }

    /**
    * Define cpf
    * @param cpf cpf
    * @generated
    */
    public Colaborador setCpf(java.lang.String cpf) {
        this.cpf = cpf;
        return this;
    }
    /**
    * Obtém dataNasc
    * return dataNasc
    * @generated
    */
    public java.util.Date getDataNasc() {
        return this.dataNasc;
    }

    /**
    * Define dataNasc
    * @param dataNasc dataNasc
    * @generated
    */
    public Colaborador setDataNasc(java.util.Date dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }
    /**
    * Obtém endereco
    * return endereco
    * @generated
    */
    public java.lang.String getEndereco() {
        return this.endereco;
    }

    /**
    * Define endereco
    * @param endereco endereco
    * @generated
    */
    public Colaborador setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
        return this;
    }
    /**
    * Obtém telefone
    * return telefone
    * @generated
    */
    public java.lang.String getTelefone() {
        return this.telefone;
    }

    /**
    * Define telefone
    * @param telefone telefone
    * @generated
    */
    public Colaborador setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public Colaborador setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }
    /**
    * Obtém cargo
    * return cargo
    * @generated
    */
    public Cargo getCargo() {
        return this.cargo;
    }

    /**
    * Define cargo
    * @param cargo cargo
    * @generated
    */
    public Colaborador setCargo(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém dataAdmissao
    * return dataAdmissao
    * @generated
    */
    public java.util.Date getDataAdmissao() {
        return this.dataAdmissao;
    }

    /**
    * Define dataAdmissao
    * @param dataAdmissao dataAdmissao
    * @generated
    */
    public Colaborador setDataAdmissao(java.util.Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
    }
    /**
    * Obtém salarioBaseMaisSalarioCargo
    * return salarioBaseMaisSalarioCargo
    * @generated
    */
    public java.math.BigDecimal getSalarioBaseMaisSalarioCargo() {
        return this.salarioBaseMaisSalarioCargo;
    }

    /**
    * Define salarioBaseMaisSalarioCargo
    * @param salarioBaseMaisSalarioCargo salarioBaseMaisSalarioCargo
    * @generated
    */
    public Colaborador setSalarioBaseMaisSalarioCargo(java.math.BigDecimal salarioBaseMaisSalarioCargo) {
        this.salarioBaseMaisSalarioCargo = salarioBaseMaisSalarioCargo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Colaborador object = (Colaborador)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}