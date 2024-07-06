package com.distribuida.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.distribuida.entities.Libro;
@Repository
public interface LibroDAO {

	public List<Libro>findAll();
	
	public Libro findOne(int id);
	public void add(Libro libro);
	public void up (Libro libro);
	public void del(int id);

}
