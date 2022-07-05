package br.com.java.model;

import java.util.Objects;

public class Gato {
	
	 private String nome;
	 private String cor;
	 private Integer idade;

	 public Gato() {
	    } // construtor vazio a partir do CTRL+3

	//construtor a partir do ctrl+3
	 public Gato(String nome, String cor, Integer idade) {
	        this.nome = nome;
	        this.cor = cor;
	        this.idade = idade;
	    }

	// getters and setters a partir do ctrl+3   
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public Integer getIdade() {
	        return idade;
	    }

	    public void setIdade(Integer idade) {
	        this.idade = idade;
	    }

	//  geração de equals  and hashCode

	    @Override
	    public int hashCode() {
	        return Objects.hash(cor, idade, nome);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Gato other = (Gato) obj;
	        return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	    }

	    // geração de toString
	    @Override
	    public String toString() {
	        return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	    }

	    // criação manual de um construtor
	    /*
	     * public Gato(String nome, String cor, Integer idade) { this.nome = nome;
	     * this.cor = cor; this.idade = idade; }
	     */

	


}
