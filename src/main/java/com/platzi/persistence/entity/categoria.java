package com.platzi.persistence.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class categoria {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_categoria", nullable = false)
	    private Integer idCategoria;

	    @Column(name = "descripcion", length = 45, nullable = false)
	    private String descripcion;

	    @Column(name = "estado", nullable = false)
	    private Boolean estado;

	    // Getters y Setters
	    public Integer getIdCategoria() {
	        return idCategoria;
	    }

	    public void setIdCategoria(Integer idCategoria) {
	        this.idCategoria = idCategoria;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public Boolean getEstado() {
	        return estado;
	    }

	    public void setEstado(Boolean estado) {
	        this.estado = estado;
	    }
}
