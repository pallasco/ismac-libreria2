package com.distribuida.principal;

import java.util.Date;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
		ClienteDAO clienteDAO=context.getBean("clienteDAOImpl",ClienteDAO.class);
		//add
		Factura factura = new Factura (0,"FAC-0092",new Date(),23.36,5.36,30.68, null);
		factura.setCliente(clienteDAO.findOne(2));
		facturaDAO.add(factura);
		
		//UPDATE ACTUALIZADO
		
	//	Factura factura2 = new Factura (86,"FAC-0091",new Date(),23.32,5.32,30.62, null);
	//	factura2.setCliente(clienteDAO.findOne(3));
		//facturaDAO.up(factura2);
		
		//del BORRADO
	//	facturaDAO.del(86);
		//findOne
		
		
		System.out.println("************DEL*******"+facturaDAO.findOne(86));
		//findAll
		//List<Factura> Facturas= FacturaDAO.findAll();	
		facturaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}

}
