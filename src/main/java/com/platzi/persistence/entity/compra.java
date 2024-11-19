package com.platzi.persistence.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compras") 
public class compra {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_compra", nullable = false)
	    private Integer idCompra;

	    @Column(name = "id_cliente", length = 20, nullable = false)
	    private String idCliente;

	    @Column(name = "fecha", nullable = false)
	    private LocalDateTime fecha;

	    @Column(name = "medio_pago", length = 1, nullable = true)
	    private String medioPago;

	    @Column(name = "comentario", length = 300, nullable = true)
	    private String comentario;

	    @Column(name = "estado", length = 1, nullable = true)
	    private String estado;

	    // Getters y Setters
	    public Integer getIdCompra() {
	        return idCompra;
	    }

	    public void setIdCompra(Integer idCompra) {
	        this.idCompra = idCompra;
	    }

	    public String getIdCliente() {
	        return idCliente;
	    }

	    public void setIdCliente(String idCliente) {
	        this.idCliente = idCliente;
	    }

	    public LocalDateTime getFecha() {
	        return fecha;
	    }

	    public void setFecha(LocalDateTime fecha) {
	        this.fecha = fecha;
	    }

	    public String getMedioPago() {
	        return medioPago;
	    }

	    public void setMedioPago(String medioPago) {
	        this.medioPago = medioPago;
	    }

	    public String getComentario() {
	        return comentario;
	    }

	    public void setComentario(String comentario) {
	        this.comentario = comentario;
	    }

	    public String getEstado() {
	        return estado;
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }
}
