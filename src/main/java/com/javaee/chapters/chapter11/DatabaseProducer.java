package com.javaee.chapters.chapter11;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DatabaseProducer {
	
	@Produces
	@PersistenceContext(unitName = "chapter11PU")
	private EntityManager em;

}
