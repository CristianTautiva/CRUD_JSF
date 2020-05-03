package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import com.entities.Mensaje;
import com.util.JPAUtil;

public class MensajeDao {
	EntityManager em = null;
	
	public MensajeDao() {
		this.em = JPAUtil.getEntityManagerFactory().createEntityManager();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Mensaje> listar (){
		return (List<Mensaje>) em.createQuery("select m from Mensaje m").getResultList();
	}
	
	public void insertar(Mensaje mensaje) {
		try {
			em.getTransaction().begin();
			em.persist(mensaje);
			em.getTransaction().commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}finally {
			em.close();
		}
		
	}
	
	public void update(Mensaje mensaje) {
		try {
			em.getTransaction().begin();
			em.merge(mensaje);
			em.getTransaction().commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}finally {
			em.close();
		}
		
	}
	
	public void delete(Mensaje mensaje) {
		try {
			em.getTransaction().begin();
			em.remove(mensaje);
			em.getTransaction().commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}finally {
			em.close();
		}
		
	}
	

}
