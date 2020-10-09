package aula5.heranca;

import java.util.ArrayList;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private String rg;
	private Integer idade;
	
	@Override
	public int compareTo(Pessoa pessoa) {
		if (this.idade < pessoa.idade)
			return -1;
		if (this.idade > pessoa.idade)
			return 5;
		else
		    return 0;
	}
	public void imprimirColecaoPessoas(ArrayList<Pessoa> lst) {
		for (Pessoa p : lst) {
			System.out.println(p);
		}	
	}
	public Pessoa(String nome, String cpf, String rg, Integer idade){
		this.nome=nome;
		this.cpf=cpf;
		this.rg=rg;
		this.idade=idade;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: "+getNome()+" CPF: "+getCpf() + " RG: "+getRg() +" Idade: " +getIdade() ;
	}
}
