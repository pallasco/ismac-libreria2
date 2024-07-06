package com.distribuida.principal;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ClienteDAO clienteDAO =context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		// CRUD CREADE, READ, UPDATE, DELETE
		//  ADD AGREGADO
		Cliente cliente = new Cliente(0, "0504616053", "Alex","Tapia", "0999803876"," Tumbaco", "alex@gamil.com");
		clienteDAO.add(cliente);
		
		 // UP actualizacion
		
		Cliente cliente3 = new Cliente(42, "05046160532", "Juan","Catota", "09998038762"," Arenal", "juan@gamil.com");
		//clienteDAO.up(cliente2);
		
		// DEL borrado
	clienteDAO.del(42);
		
	// FinOne
   System.out.println("********** DEL **********"+clienteDAO.findOne(42));
		
	// List<Cliente> clientes  = clienteDAO.findAll();
	//clientes.forEach(item -> {
		//System.out.println(item.toString());
     
     clienteDAO.findAll().forEach(item -> {System.out.println(item.toString());});
	
	
		context.close();
		
	}

}
