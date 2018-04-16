package com.pe.devcode;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainPersistence {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");

    public static void main(String[] args) throws Exception {
        try {
        	
        	EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();        	
        	
        	Pelicula p = new Pelicula(1, "X-MEN");
            
            em.persist(p);
            
            em.getTransaction().commit();
            
            Pelicula pelLoaded = em.find(Pelicula.class, 1);
            
            System.out.println("pelicula: "+ pelLoaded);

        } finally {
            emf.close();
        }
    }
}