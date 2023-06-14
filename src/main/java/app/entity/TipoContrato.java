
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
* Classe que representa a tabela TIPOCONTRATO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TIPOCONTRATO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TipoContrato")
public class TipoContrato implements Serializable {
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
    @Column(name = "tipoDoContrato", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String tipoDoContrato;


    /**
    * @generated
    */
    @Column(name = "jornadaDeTrabalho", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer jornadaDeTrabalho;


    /**
    * @generated
    */
    @Column(name = "beneficios", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal beneficios;


    /**
    * @generated
    */
    @Column(name = "descontos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal descontos;


    /**
    * @generated
    */
    @Column(name = "decimoTerceiro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal decimoTerceiro;


    /**
    * Construtor
    * @generated
    */
    public TipoContrato(){
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
    public TipoContrato setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém tipoDoContrato
    * return tipoDoContrato
    * @generated
    */
    public java.lang.String getTipoDoContrato() {
        return this.tipoDoContrato;
    }

    /**
    * Define tipoDoContrato
    * @param tipoDoContrato tipoDoContrato
    * @generated
    */
    public TipoContrato setTipoDoContrato(java.lang.String tipoDoContrato) {
        this.tipoDoContrato = tipoDoContrato;
        return this;
    }
    /**
    * Obtém jornadaDeTrabalho
    * return jornadaDeTrabalho
    * @generated
    */
    public java.lang.Integer getJornadaDeTrabalho() {
        return this.jornadaDeTrabalho;
    }

    /**
    * Define jornadaDeTrabalho
    * @param jornadaDeTrabalho jornadaDeTrabalho
    * @generated
    */
    public TipoContrato setJornadaDeTrabalho(java.lang.Integer jornadaDeTrabalho) {
        this.jornadaDeTrabalho = jornadaDeTrabalho;
        return this;
    }
    /**
    * Obtém beneficios
    * return beneficios
    * @generated
    */
    public java.math.BigDecimal getBeneficios() {
        return this.beneficios;
    }

    /**
    * Define beneficios
    * @param beneficios beneficios
    * @generated
    */
    public TipoContrato setBeneficios(java.math.BigDecimal beneficios) {
        this.beneficios = beneficios;
        return this;
    }
    /**
    * Obtém descontos
    * return descontos
    * @generated
    */
    public java.math.BigDecimal getDescontos() {
        return this.descontos;
    }

    /**
    * Define descontos
    * @param descontos descontos
    * @generated
    */
    public TipoContrato setDescontos(java.math.BigDecimal descontos) {
        this.descontos = descontos;
        return this;
    }
    /**
    * Obtém decimoTerceiro
    * return decimoTerceiro
    * @generated
    */
    public java.math.BigDecimal getDecimoTerceiro() {
        return this.decimoTerceiro;
    }

    /**
    * Define decimoTerceiro
    * @param decimoTerceiro decimoTerceiro
    * @generated
    */
    public TipoContrato setDecimoTerceiro(java.math.BigDecimal decimoTerceiro) {
        this.decimoTerceiro = decimoTerceiro;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TipoContrato object = (TipoContrato)obj;
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