package com.distribuida.dao;

import com.distribuida.entities.Cliente;

import antlr.collections.List;

public interface ClienteDAO {
	
	 
	public List<Cliente>fidAll();
	
	public Cliente findOne(int id);
	public void add(Cliente cliente);
	public void up (Cliente cliente);
	public void del(int id);
}
