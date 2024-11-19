package com.platzi.persistence.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class compra_producto {
	@EmbeddedId
	private compra_productoPK id;

    @Column(name = "cantidad", nullable = true)
    private Integer cantidad;

    @Column(name = "total", precision = 16, scale = 2, nullable = true)
    private Double total;

    @Column(name = "estado", nullable = true)
    private Boolean estado;

	public compra_productoPK getId() {
		return id;
	}

	public void setId(compra_productoPK id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
    
    
}
