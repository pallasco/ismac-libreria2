package com.distribuida.principal;



import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturadetalleDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Facturadetalle;


public class PrincipalFacturadetalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		FacturadetalleDAO facturadetalleDAO = context.getBean("facturadetalleDAOImpl",FacturadetalleDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
		FacturaDAO facturaDAO=context.getBean("facturaDAOImpl",FacturaDAO.class);
		LibroDAO libroDAO=context.getBean("libroDAOImpl",LibroDAO.class);
		//add
		Facturadetalle facturadetalle = new Facturadetalle(0,25,25.30,null,null);
		facturadetalle.setFactura(facturaDAO.findOne(2));
		facturadetalle.setLibro(libroDAO.findOne(2));
	facturadetalleDAO.add(facturadetalle);
			
		//UPDATE ACTUALIZADO
		
 /*Facturadetalle facturadetalle2 = new Facturadetalle ();
	facturadetalle2.setFactura(facturaDAO.findOne(2));
	facturadetalle2.setLibro(libroDAO.findOne(2));
	facturadetalleDAO.up(facturadetalle2);
		*/
		//del BORRADO
		//facturadetalleDAO.del(210);
		//findOne
		
		
	//	System.out.println("************DEL*******"+facturadetalleDAO.findOne(86));
		//findAll
		//List<Factura> Facturas= FacturaDAO.findAll();	
		facturadetalleDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
