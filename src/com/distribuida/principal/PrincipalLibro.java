package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;



public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Patron de Ioc o Inversion de control
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		LibroDAO  libroDAO = context.getBean("libroDAOImpl",LibroDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
	CategoriaDAO categoriaDAO=context.getBean("categoriaDAOImpl",CategoriaDAO.class);
	AutorDAO autorDAO=context.getBean("autorDAOImpl3",AutorDAO.class);
		//add
	Libro libro = new Libro(0,"amm","emm",500,"limitada","ingles",new Date (),"jaja","jeje","cv",25,"papel","lamina",25.30,null,null);
		libro.setCategoria(categoriaDAO.findOne(2));
		libro.setAutor(autorDAO.findOne(2));
	libroDAO.add(libro);
	
		//UPDATE ACTUALIZADO
		
	/*Libro libro2 = new Libro (0,"lll","dfdf",700,"ghgf","dfhdgf",new Date (),"fdgd","fgdf","fg",25,"fgdf","gdf",25.30,null,null);
	libro2.setCategoria(categoriaDAO.findOne(2));
	libro2.setAutor(autorDAO.findOne(2));
	libroDAO.up(libro2);*/
		
		//del BORRADO
	libroDAO.del(79);
	
	//	findOne
		
		
		//System.out.println("************DEL*******"+libroDAO.findOne(86));
		//findAll
		//List<Factura> Facturas= FacturaDAO.findAll();	
		libroDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
	
		
	}
	


}
