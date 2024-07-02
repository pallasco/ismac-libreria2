package com.distribuida.dao;

import org.springframework.stereotype.Repository;
import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Factura;

@Repository

public class FacturaDAOImpl implements FacturaDAO {
	

	//SELECT *FROM Factura --->>SQL
	//from Factura  --->>HQL
	//SELECT cl.* FROM Factura AS cl --->>> SQL
	//SELECT CL FROM Factura cl  ----HQL
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Factura> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Factura",Factura.class).getResultList();
		
	}
	
	

	@Override
	@Transactional
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Factura.class,id);
	}

	@Override
	@Transactional
	public void add(Factura factura) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(factura);
	
	}

	@Override
	@Transactional
	public void up(Factura factura) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(factura);
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
