
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
* Classe que representa a tabela CONTRATO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CONTRATO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Contrato")
public class Contrato implements Serializable {
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
    @OneToOne
    @JoinColumn(name="fk_colaborador", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Colaborador colaborador;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataAdmissaoGET", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataAdmissaoGET;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataFinalContratoPOST", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataFinalContratoPOST;


    /**
    * @generated
    */
    @Column(name = "salarioFinal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal salarioFinal;


    /**
    * @generated
    */
    @Column(name = "testeReceberTipoContrato", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String testeReceberTipoContrato;


    /**
    * @generated
    */
    @Column(name = "descontos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal descontos;


    /**
    * @generated
    */
    @Column(name = "beneficios", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.math.BigDecimal beneficios;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipoContrato", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private TipoContrato tipoContrato;


    /**
    * Construtor
    * @generated
    */
    public Contrato(){
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
    public Contrato setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém colaborador
    * return colaborador
    * @generated
    */
    public Colaborador getColaborador() {
        return this.colaborador;
    }

    /**
    * Define colaborador
    * @param colaborador colaborador
    * @generated
    */
    public Contrato setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
        return this;
    }
    /**
    * Obtém dataAdmissaoGET
    * return dataAdmissaoGET
    * @generated
    */
    public java.util.Date getDataAdmissaoGET() {
        return this.dataAdmissaoGET;
    }

    /**
    * Define dataAdmissaoGET
    * @param dataAdmissaoGET dataAdmissaoGET
    * @generated
    */
    public Contrato setDataAdmissaoGET(java.util.Date dataAdmissaoGET) {
        this.dataAdmissaoGET = dataAdmissaoGET;
        return this;
    }
    /**
    * Obtém dataFinalContratoPOST
    * return dataFinalContratoPOST
    * @generated
    */
    public java.util.Date getDataFinalContratoPOST() {
        return this.dataFinalContratoPOST;
    }

    /**
    * Define dataFinalContratoPOST
    * @param dataFinalContratoPOST dataFinalContratoPOST
    * @generated
    */
    public Contrato setDataFinalContratoPOST(java.util.Date dataFinalContratoPOST) {
        this.dataFinalContratoPOST = dataFinalContratoPOST;
        return this;
    }
    /**
    * Obtém salarioFinal
    * return salarioFinal
    * @generated
    */
    public java.math.BigDecimal getSalarioFinal() {
        return this.salarioFinal;
    }

    /**
    * Define salarioFinal
    * @param salarioFinal salarioFinal
    * @generated
    */
    public Contrato setSalarioFinal(java.math.BigDecimal salarioFinal) {
        this.salarioFinal = salarioFinal;
        return this;
    }
    /**
    * Obtém testeReceberTipoContrato
    * return testeReceberTipoContrato
    * @generated
    */
    public java.lang.String getTesteReceberTipoContrato() {
        return this.testeReceberTipoContrato;
    }

    /**
    * Define testeReceberTipoContrato
    * @param testeReceberTipoContrato testeReceberTipoContrato
    * @generated
    */
    public Contrato setTesteReceberTipoContrato(java.lang.String testeReceberTipoContrato) {
        this.testeReceberTipoContrato = testeReceberTipoContrato;
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
    public Contrato setDescontos(java.math.BigDecimal descontos) {
        this.descontos = descontos;
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
    public Contrato setBeneficios(java.math.BigDecimal beneficios) {
        this.beneficios = beneficios;
        return this;
    }
    /**
    * Obtém tipoContrato
    * return tipoContrato
    * @generated
    */
    public TipoContrato getTipoContrato() {
        return this.tipoContrato;
    }

    /**
    * Define tipoContrato
    * @param tipoContrato tipoContrato
    * @generated
    */
    public Contrato setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Contrato object = (Contrato)obj;
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