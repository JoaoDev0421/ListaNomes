package Integracao_Nomes.Integracao_Nomes;



import org.junit.Test;

public class Start {

	
	  @Test
	  public void Start_Salvar() {
		  
		    Dao_Lista dao_salvar = new Dao_Lista();
		    
		    Modelos_Integracao nome = new Modelos_Integracao();
		    
		    nome.setNome("Leia Ap. ");
		    nome.setEndereco("Arlindo Francisco Pizzi ");
		    
		    dao_salvar.Salvar(nome);
	  }
	  
	  
	  @Test
	  public void Start_Consulta() {
		  
		  Dao_Lista dao_consulta = new Dao_Lista();
	      
		  dao_consulta.Consulta(3L);
	  }
	  
	  @Test
	  public void Start_Atualizar() {
		  
		  Dao_Lista dao_atualizar = new Dao_Lista();
		  
		  dao_atualizar.Atualizar(4L, "Jose Fernando");
		   
		  
	  }
	  
	  @Test
	  public void Start_Remover() {
		  
		  Dao_Lista dao_remove = new Dao_Lista();
		  
		  dao_remove.Remove(4L);
	  }
	  
	  

	
}
