package model;
// Generated 05/03/2014 12:54:08 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Transaccion generated by hbm2java
 */
@Entity
@Table(name="transaccion"
    ,catalog="bdjpweb"
)
public class Transaccion  implements java.io.Serializable {


     private Integer id;
     private String clave;
     private String nombre;
     private String descripcion;
     private String tipo;
     private Set movimientoencs = new HashSet(0);

    public Transaccion() {
        this.id = 0;
    }

	
    public Transaccion(String clave, String nombre, String tipo) {
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public Transaccion(String clave, String nombre, String descripcion, String tipo, Set movimientoencs) {
       this.clave = clave;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.tipo = tipo;
       this.movimientoencs = movimientoencs;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="clave", nullable=false, length=45)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="tipo", nullable=false, length=45)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="transaccion")
    public Set getMovimientoencs() {
        return this.movimientoencs;
    }
    
    public void setMovimientoencs(Set movimientoencs) {
        this.movimientoencs = movimientoencs;
    }




}


