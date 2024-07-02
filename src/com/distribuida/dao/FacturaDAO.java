package com.distribuida.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.distribuida.entities.Factura;
@Repository
public interface FacturaDAO {

	public List<Factura>findAll();
	
	
	public Factura findOne(int id);
	public void add(Factura factura);
	public void up (Factura factura);
	public void del(int id);
}
