package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AutorDAO autorDAO =context.getBean("autorDAOImpl3", AutorDAO.class);
		
		// CRUD CREADE, READ, UPDATE, DELETE
		///  ADD AGREGADO
	Autor autor = new Autor(0, "Alex","Tapia","Ecuador"," Tumbaco", "0999803876", "alex@gamil.com");
	//autorDAO.add(autor);
		
		 // UP actualizacion
		
		Autor autor2 = new Autor(61, "Juan","Catota","Ecuador"," Lumbisi", "0999803876", "juan@gamil.com");
		//autorDAO.up(autor2);
		
		// DEL borrado
	autorDAO.del(61);
		
	// FinOne
 //  System.out.println("********** DEL **********"+autorDAO.findOne(61));
		
	// List<Autor> Autors  = AutorDAO.findAll();
	//Autors.forEach(item -> {
		//System.out.println(item.toString());
     
     autorDAO.findAll().forEach(item -> {System.out.println(item.toString());});
	
	
		context.close();
		
	}

}
