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
 * Rol generated by hbm2java
 */
@Entity
@Table(name="rol"
    ,catalog="bdjpweb"
)
public class Rol  implements java.io.Serializable {

     private Integer id;
     private String nombre;
     private String descripcion;
     private String permiso;
     private Set usuarios = new HashSet(0);

    public Rol() {
        this.id = 0;
    }

	
    public Rol(String nombre, String permiso) {
        this.nombre = nombre;
        this.permiso = permiso;
    }
    public Rol(String nombre, String descripcion, String permiso, Set usuarios) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.permiso = permiso;
       this.usuarios = usuarios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    
    @Column(name="permiso", nullable=false, length=45)
    public String getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rol")
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


