package com.pacoillan.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pacoillan.model.Entidad;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidadPersistencia");
		EntityManager em = emf.createEntityManager();
		Entidad entidad = em.find(Entidad.class,1);
		
		System.out.println(entidad.getNombre());
		
		
		
		

	}

}
