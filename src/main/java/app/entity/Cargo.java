
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
* Classe que representa a tabela CARGO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CARGO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cargo")
public class Cargo implements Serializable {
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
    @Column(name = "cargo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cargo;


    /**
    * @generated
    */
    @Column(name = "salarioBase", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal salarioBase;


    /**
    * Construtor
    * @generated
    */
    public Cargo(){
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
    public Cargo setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém cargo
    * return cargo
    * @generated
    */
    public java.lang.String getCargo() {
        return this.cargo;
    }

    /**
    * Define cargo
    * @param cargo cargo
    * @generated
    */
    public Cargo setCargo(java.lang.String cargo) {
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém salarioBase
    * return salarioBase
    * @generated
    */
    public java.math.BigDecimal getSalarioBase() {
        return this.salarioBase;
    }

    /**
    * Define salarioBase
    * @param salarioBase salarioBase
    * @generated
    */
    public Cargo setSalarioBase(java.math.BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cargo object = (Cargo)obj;
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