package com.pe.devcode;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class _Aplicacion {
	
	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
    public static void main(String[] args) {

        try {
        	
        	Session session = sessionFactory.openSession();
        	session.beginTransaction();
        	
        	Metadata met01 = new Metadata(2016,"DVD");
        	
        	Genero gen01= new Genero("Accion");
        	Genero gen02= new Genero("Drama");
        	
        	
        	Actor act01= new Actor("Egdar Ramirez");
        	Actor act02= new Actor("Antonio Banderas");
        	        	
        	Distribuidor dis= new Distribuidor("Sony Picture");
        	
        	Guionista gui01= new Guionista("Richard David");
        	Guionista gui02= new Guionista("Sofia Maria");
        	
        	Recaudado rec01= new Recaudado("CANADA01",20000d,"CANADA");
        	Recaudado rec02= new Recaudado("USA02",70000d,"USA");
        	Recaudado rec03= new Recaudado("ESPAYIA03",50000d,"ESPAYIA");
        	
        	
        	Pelicula pel01= new Pelicula("La ultima guerra",met01, dis, Calidad._1080);
        	
        	
        	pel01.getGeneros().add(gen01);
        	pel01.getGeneros().add(gen02);
        	
        	
        	pel01.getActores().add(act01);
        	pel01.getActores().add(act02);
        	
        	
        	pel01.getGuionistas().add(gui01);
        	pel01.getGuionistas().add(gui02);
        	
        	pel01.getRecaudados().put("CANADA01", rec01);
        	pel01.getRecaudados().put("USA02", rec02);
        	pel01.getRecaudados().put("ESPAYIA03", rec03);
        	
        	act01.setPelicula(pel01);
        	
        	
        	dis.getPeliculas().add(pel01);
        	
        	
        	gui01.getPeliculas().add(pel01);
        	
        	
        	gui02.getPeliculas().add(pel01);
        	
        	rec01.setPelicula(pel01);
        	
        	rec02.setPelicula(pel01);
        	
        	rec03.setPelicula(pel01);
        	
            
            session.persist(gen01);
            session.persist(gen02);
            session.persist(pel01);
            
            
            session.getTransaction().commit();
            
            
            System.out.println("\nActores Iniciales:");
            pel01.getActores().forEach(System.out::println); 
            
            pel01.getActores().get(0).setNombre("Maximo Harrigan");
            
            System.out.println("\nActores Modificaos:");
            pel01.getActores().forEach(System.out::println);             
            
            Pelicula pelLoaded = session.find(Pelicula.class, 1);
            System.out.println("\nPelicula Cargada: " + pelLoaded);
            
            List<Pelicula> peliculas = session.createQuery("FROM Pelicula").list();
            System.out.println("\nPeliculas consultadas:");
            peliculas.forEach(System.out::println);
            
            List<Guionista> guionistas = session.createQuery("FROM Guionista").list();
            System.out.println("\nguionistas");
            guionistas.forEach(System.out::println);
            
            List<Genero> generos = session.createQuery("FROM Genero").list();
            System.out.println("\nGeneros Consultdos:");
            generos.forEach(System.out::println); 
            
            
            List<Recaudado> recaudados = session.createQuery("FROM Recaudado").list();
            System.out.println("\nRecaudados Consultdos:");
            recaudados.forEach(System.out::println); 
            
            List<Actor> actores01 = session.createQuery("FROM Actor").list();
            System.out.println("\nActores Resultantes Consultdos:");
            actores01.forEach(System.out::println); 
            
            session.beginTransaction();
            
//            session.delete(pel01.getActores().get(0));
            
            pel01.getActores().remove(0);
            session.saveOrUpdate(pel01);
            session.getTransaction().commit();
            
            List<Actor> actores02 = session.createQuery("FROM Actor").list();
            System.out.println("\nActores Resultantes despues de elim Consultdos:");
            actores02.forEach(System.out::println); 
            
            session.close();
        } finally {
            sessionFactory.close();
        }
    }
}