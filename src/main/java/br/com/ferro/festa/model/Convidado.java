package br.com.ferro.festa.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Convidado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(generator = "increment")
		@GenericGenerator(name = "increment", strategy = "increment")
		private Long id;
		
		@NotNull
		private String nome;
		
		@NotNull
		private Integer quantidadeAcompanhantes;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getQuantidadeAcompanhantes() {
			return quantidadeAcompanhantes;
		}

		public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
			this.quantidadeAcompanhantes = quantidadeAcompanhantes;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
	

}
