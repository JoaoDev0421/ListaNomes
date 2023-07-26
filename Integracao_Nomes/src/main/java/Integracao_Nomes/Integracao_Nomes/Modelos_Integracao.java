package Integracao_Nomes.Integracao_Nomes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Lista")
public class Modelos_Integracao {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	  private String nome;
	  private String endereco;
	  
	  
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Modelos_Integracao [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	  
	  
	 
}
