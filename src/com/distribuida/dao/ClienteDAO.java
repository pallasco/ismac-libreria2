package com.distribuida.dao;

import com.distribuida.entities.Cliente;
import com.mchange.v1.util.ListUtils;

import antlr.collections.List;

public interface ClienteDAO {
	
	 
	public ListUtils<Cliente>fidAll();
	
	public Cliente findOne(int id);
	public void add(Cliente cliente);
	public void up (Cliente cliente);
	public void del(int id);
}
