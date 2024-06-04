package com.distribuida.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.distribuida.entities.Cliente;
import com.mchange.v1.util.ListUtils;


@Repository
public class ClienteDAOImpl implements ClienteDAO {
	
	
	
	 // select*from cliente ---> SQL
	// from Cliente         ---> HQ
	
	// select cl.* from cliente as cl ---->SQL
	//select cl from cliente cl ----> HQL
	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<Cliente> findAll(){
		Session session =sessionFactory.getCurrentSession();
		
		return session.createQuery("from Cliente",Cliente.class).getResultList();

		
	}
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
