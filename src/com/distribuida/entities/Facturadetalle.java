package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name= "factura_detalle")
public class Facturadetalle {
	//@OneToOne
			//@ManyToOne
			//@OneToMany
			@Id
			@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name ="id_factura_detalle")
	private int idfacturadetalle;
			@Column(name="cantidad")
	private int cantidad;
		@Column(name="subtotal")
	private Double subtotal;
		//@Column(name="factura")
	//private Factura factura;
//	private Libro libro;
		
		
		@JoinColumn(name ="id_factura")
		@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
		private Factura factura;
		@JoinColumn(name ="id_libro")
		@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
		private Libro libro;
		
	 public Facturadetalle() {
			// TODO Auto-generated constructor stub
		}

	public Facturadetalle(int idfacturadetalle, int cantidad, Double subtotal, Factura factura, Libro libro) {
		this.idfacturadetalle = idfacturadetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
		this.libro = libro;
	}

	public int getIdfacturadetalle() {
		return idfacturadetalle;
	}

	public void setIdfacturadetalle(int idfacturadetalle) {
		this.idfacturadetalle = idfacturadetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "Facturadetalle [idfacturadetalle=" + idfacturadetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}

}
