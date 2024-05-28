package com.distribuida.entities;

public class Facturadetalle {
	
	private int idfacturadetalle;
	private int cantidad;
	private Double subtotal;
	private Factura factura;
	private Libro libro;
	
	@SuppressWarnings("unused")
	private Facturadetalle() {
		
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
