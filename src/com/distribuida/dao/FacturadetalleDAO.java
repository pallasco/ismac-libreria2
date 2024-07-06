package com.distribuida.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Facturadetalle;

@Repository
public interface FacturadetalleDAO {


	public List<Facturadetalle>findAll();
	
	public Facturadetalle findOne(int id);
	public void add(Facturadetalle facturadetalle);
	public void up (Facturadetalle facturadetalle);
	public void del(int id);

}
