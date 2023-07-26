package Integracao_Nomes.Integracao_Nomes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Dao_Lista {

	
	   private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integracao_Nomes");
	   
	   private EntityManager em = emf.createEntityManager();

	   
	   
	   
	   // metodo Insert
	    public void Salvar(Modelos_Integracao produto) {
		   
	       em.persist(produto);
		   em.getTransaction().begin();
		   em.getTransaction().commit();	  
	   }
	    
	    
	    
	    // Metodo Consultar
	   public void Consulta( long id) {

		     Modelos_Integracao buscar = em.find(Modelos_Integracao.class , id);
		   
		       if (buscar != null) {
		    	   
		    	    System.out.println("Nome Encontrado :" + buscar.toString());
		       }else {
		    	   
		    	    System.out.println("Nome nao encontrado!!");
		       }
		      em.close();
		      emf.close();
	   }
	   
	   
	   // Metodo Atualizar
	   public void Atualizar(long id , String nome) {
		   
		       Modelos_Integracao atualizar = em.find(Modelos_Integracao.class, id);
		       
		       if(atualizar != null) {
		    	   
		    	   atualizar.setNome(nome);
		    	   
		    	   
		    	   em.getTransaction().begin();
		    	   em.merge(atualizar);
		    	   em.getTransaction().commit();
		       }else {
		    	   
		    	    System.out.println("Nome não encontrado!!!!");
		       }
	   }
	   
	   
	   // Metodo Remove
	   public void Remove(long id) {
		   
		     Modelos_Integracao remover = em.find(Modelos_Integracao.class, id);
		     
		     if(remover != null) {
		    	 
		    	  em.getTransaction().begin();
		    	  em.remove(remover);
		    	  em.getTransaction().commit();
		     }else {
		    	 
		    	  System.out.println("Item nao Identificado para Excluir");
		     }
	   }
	   







	    
	    
	    
	    
}
