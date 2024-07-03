package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductocl3;
import model.TblUsuariocl3;

public class ClassProductoImp implements IProducto {

	public void RegistrarProducto(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		
EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenCL3");
		
		EntityManager em=fabr.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(producto);
		
		System.out.println("producto Registrado");
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	public void ActualizarProducto(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		
	}

	public List<TblProductocl3> ListadoProducto() {
		// TODO Auto-generated method stub
		return null;
	}



}
