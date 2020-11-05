package backend.farmacia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cassio Seffrin
 */
public abstract class Pessoa extends EntidadePersistente implements Comparable<Pessoa> {
	/**
	 * 
	 */

	private static final long serialVersionUID = 222L;

	
	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private Integer idade;
	private LocalDate dataNascimento;
	private double altura;
	private double peso;

//	@Override
//	public void imprimirColecaoPessoas(ArrayList<Pessoa> lst) {
//		for (Pessoa p : lst) {
//			System.out.println(p);
//		}
//	}

	public Pessoa(String nome, String cpf, String rg, Integer idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
	}

	public Pessoa() {

	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " CPF: " + getCpf() + " RG: " + getRg() + " Idade: " + getIdade();
	}

	public String toCSV() {
		return getNome() + ";" + getCpf() + ";" + getRg() + ";" + getIdade() + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		final Pessoa p2 = (Pessoa) obj;
		if (this.nome.equals(p2.getNome())) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		if (this.idade < pessoa.idade)
			return -1;
		if (this.idade > pessoa.idade)
			return 1;
		else
			return 0;
	}
	
//	@Override
//	public int compareTo(Pessoa pessoa) {
//		if (this.nome.contains(pessoa.getNome())) {
//			return  1;
//		}else {
//			return  -1;
//		}
//	}	
	
		

}
