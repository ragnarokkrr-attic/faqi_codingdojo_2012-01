package org.faqi.exercicio;

public class Nadador {

	private String nome;
	private int idade;
	
	public Nadador(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
	public void setNome(String nome){
		this.nome = nome; 
	}
	public void setIdade( int idade){
		this.idade = idade;
	}
	
	public String classicaModalidade(){
		if(idade >= 5 && idade < 7){
			return "infantil A";
		}else if(idade >= 8)
		return "String nao classificado.";
	}
}