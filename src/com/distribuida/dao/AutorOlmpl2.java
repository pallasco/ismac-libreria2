package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Autor;

public class AutorOlmpl2 implements AutorDAO {
	
	// HQL
	// FINDALL
//	("SELECT au FROM Autor au", Autor.class)
	
	
	//FindOne
	//Query query = session.createQuery("SELECT au FROM Autor aun WHERE au.idAutor =: keyIdAutor");
	
	//add 
	// INSER INTO (.....) VALUES (....) NO ES PERMITIDO
	// INSERT INTO (....) SELECT (......) SI ES PERMITIDO
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
public List<Autor> findAll(){
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("SELECT au FROM Autor au", Autor.class).getResultList();
		
	}
	
@Override
@Transactional
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
	Session session = sessionFactory.getCurrentSession();
	Query query = session.createQuery("SELECT au FROM Autor aun WHERE au.idAutor =: keyIdAutor");
	query.setParameter("keyIdAutor", id);
		return (Autor) query.getSingleResult();
	}
@Override
@Transactional
public void add(Autor Autor) {
		// TODO Auto-generated method stub
	Session session = sessionFactory.getCurrentSession();
session.saveOrUpdate("Autor");
	}

@Override
@Transactional
	public void up(Autor Autor) {
		// TODO Auto-generated method stub
	Session session = sessionFactory.getCurrentSession();
Query query = session.createQuery(" UPDATE Autor au SET au.nombre=: keyNombre"+ 
								"            , au.apellido =: keyApellido"
								+ "             ,au.pais =: keyPais"+
								"               ,au.direccion =: keyDireccion"+
								"               ,au.telefono =: keyTelefono"+
								"                ,aun.correo =. keyCorreo"+
								"               WHERE au.idAutor =: keyidAutor");
query.setParameter("keyNombre", Autor.getNombre());
query.setParameter("keyApellido", Autor.getApellido());
query.setParameter("keyPais", Autor.getPais());
query.setParameter("keyDireccion", Autor.getDireccion());
query.setParameter("keyTelefono", Autor.getTelefono());
query.setParameter("keyCorreo", Autor.getCorreo());
query.setParameter("keyIdAutor", Autor.getIdAutor());

query.executeUpdate();
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub

	}
	@Override
	@Transactional
	public List<Autor> fidAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
