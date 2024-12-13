package com.platzi.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class compraProducto {
	@EmbeddedId
	private compra_productoPK id;

    @Column(name = "cantidad", nullable = true)
    private Integer cantidad;

    @Column(name = "total", precision = 16, scale = 2, nullable = true)
    private Double total;

    @Column(name = "estado", nullable = true)
    private Boolean estado;
    
    @ManyToOne
	@MapsId("idCompra")
  	@JoinColumn(name = "id_compra", insertable = false, updatable = false)
  	private Compra compra;
    
    @ManyToOne
  	@JoinColumn(name = "id_producto", insertable = false, updatable = false)
  	private Producto producto;

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

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
