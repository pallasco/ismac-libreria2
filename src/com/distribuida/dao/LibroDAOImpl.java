package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Libro;


@Repository
public class LibroDAOImpl implements LibroDAO {

	//SELECT *FROM Factura --->>SQL
		//from Factura  --->>HQL
		//SELECT cl.* FROM Factura AS cl --->>> SQL
		//SELECT CL FROM Factura cl  ----HQL
		@Autowired
		private SessionFactory sessionFactory;
		@Override
		@Transactional
		////ACTUALIZACION
		public List<Libro> findAll(){
			//
			Session session = sessionFactory.getCurrentSession();
			
			return session.createQuery("from Libro",Libro.class).getResultList();
			
		}
		
		
	@Override
		@Transactional
		public Libro findOne(int id) {
			// TODO Auto-generated method stub
			Session session =sessionFactory.getCurrentSession();
			return session.get(Libro.class,id);
		}

	@Override
		@Transactional
		public void add(Libro libro) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(libro);}
		
		@Override
		@Transactional
		public void up(Libro libro) {
			Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
			session.saveOrUpdate(libro);
			// TODO Auto-generated method stub

		}

		@Override
		@Transactional
		public void del(int id) {
			Session session=sessionFactory.getCurrentSession();
			session.delete(findOne(id));
			// TODO Auto-generated method stub

		}
}
