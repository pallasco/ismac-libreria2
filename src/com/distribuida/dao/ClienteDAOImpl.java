package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Cliente;
 import org.hibernate.query.Query;

@SuppressWarnings("unused")
@Repository
public class ClienteDAOImpl implements ClienteDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Cliente> findAll(){
		Session session =sessionFactory.getCurrentSession();
		return session.createQuery("from Cliente",Cliente.class).getResultList();
	}
	
	 @Override
	 @Transactional 
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Cliente.class, id);
	}
	@Override
	@Transactional
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);
 
	}
	@Override
	@Transactional
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);
	}
	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}
	@Override
	@Transactional
	public List<Cliente> fidAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
