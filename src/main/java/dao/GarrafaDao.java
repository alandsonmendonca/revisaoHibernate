package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Garrafa;
import util.JPAUtil;

public class GarrafaDao {
	public static void salvar(Garrafa garrafa) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(garrafa);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void atualizar(Garrafa garrafa) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(garrafa);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Garrafa garrafa) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		garrafa = em.find(Garrafa.class, garrafa.getId());
		em.remove(garrafa);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Garrafa> listar(){
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select g from Garrafa g");
		List<Garrafa> resultado = q.getResultList();
		em.close();
		return resultado;
	}
}
