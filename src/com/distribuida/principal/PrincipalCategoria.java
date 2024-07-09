package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;

import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CategoriaDAO categoriaDAO =context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
		// CRUD CREADE, READ, UPDATE, DELETE
		//  ADD AGREGADO
		/*Categoria categoria = new Categoria(0, "0504616053", "Alex");
		categoriaDAO.add(categoria);
		*/
		 // UP actualizacion
		
	
		//Categoria categoria3 = new Categoria(60, "05046160532", "Juan");
		// categoriaDAO.up(categoria3);
		
		// DEL borrado
	categoriaDAO.del(58);
		
	// FinOne
   System.out.println("********** DEL **********"+categoriaDAO.findOne(42));
		
	// List<Categoria> categorias  = clienteDAO.findAll();
	//categorias.forEach(item -> {
		//System.out.println(item.toString());
     
     categoriaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
	
	
		context.close();
		
	}

	

}
