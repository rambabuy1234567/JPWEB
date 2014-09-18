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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="bdjpweb"
)
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private Rol rol;
     private Sucursal sucursal;
     private String nombre;
     private String apeliido;
     private String usuario;
     private String clave;
     private String email;
     private Set movimientoencs = new HashSet(0);

    public Usuario() {
        this.id = 0;
        this.rol = new Rol();
        this.sucursal = new Sucursal();
    }

	
    public Usuario(Rol rol, Sucursal sucursal, String nombre, String apeliido, String usuario, String clave) {
        this.rol = rol;
        this.sucursal = sucursal;
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.usuario = usuario;
        this.clave = clave;
    }
    public Usuario(Rol rol, Sucursal sucursal, String nombre, String apeliido, String usuario, String clave, String email, Set movimientoencs) {
       this.rol = rol;
       this.sucursal = sucursal;
       this.nombre = nombre;
       this.apeliido = apeliido;
       this.usuario = usuario;
       this.clave = clave;
       this.email = email;
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
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rol_id", nullable=false)
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="sucursal_id", nullable=false)
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="apeliido", nullable=false, length=45)
    public String getApeliido() {
        return this.apeliido;
    }
    
    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }
    
    @Column(name="usuario", nullable=false, length=45)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Column(name="clave", nullable=false, length=45)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getMovimientoencs() {
        return this.movimientoencs;
    }
    
    public void setMovimientoencs(Set movimientoencs) {
        this.movimientoencs = movimientoencs;
    }




}

