package com.platzi.persistence.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class cliente {
	 	@Id
	    @Column(name = "id", length = 20, nullable = false)
	    private String id;

	    @Column(name = "nombre", length = 40, nullable = true)
	    private String nombre;

	    @Column(name = "apellidos", length = 100, nullable = true)
	    private String apellidos;

	    @Column(name = "celular", nullable = true)
	    private Long celular;

	    @Column(name = "direccion", length = 80, nullable = true)
	    private String direccion;

	    @Column(name = "correo_electronico", length = 70, nullable = true)
	    private String correoElectronico;

	    @OneToMany(mappedBy = "cliente")
	    private List<Compra> compra;
	    
	    // Getters y Setters
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public Long getCelular() {
	        return celular;
	    }

	    public void setCelular(Long celular) {
	        this.celular = celular;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }

	    public void setCorreoElectronico(String correoElectronico) {
	        this.correoElectronico = correoElectronico;
	    }
	}