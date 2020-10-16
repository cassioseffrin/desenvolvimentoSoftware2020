package aula5.heranca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa implements Comparable<Pessoa>, FluxoDados {
	private String nome;
	private String cpf;
	private String rg;
	private Integer idade;
	private LocalDate dataNascimento;
	
	 


	private static String ARQUIVO = "/Users/cassioseffrin/farmacia/pessoa.csv";

	@Override
	public void imprimirColecaoPessoas(ArrayList<Pessoa> lst) {
		for (Pessoa p : lst) {
			System.out.println(p);
		}
	}

	public Pessoa(String nome, String cpf, String rg, Integer idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
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
			return 5;
		else
			return 0;
	}

	@Override
	public boolean gravarArquivo() {
		try {
			File f = new File(ARQUIVO);
			FileOutputStream fos = new FileOutputStream(f, true);
			fos.write(toCSV().getBytes());
			fos.flush();
			fos.close();
			System.out.printf("A pessoa %s foi salva com sucesso!\n", getNome());
			return true;
		} catch (IOException e) {
			System.out.println("erro ao gravar " + ARQUIVO);
			return false;
		}
	}

	@Override
	public ArrayList<Pessoa> lerTodos() {

		try {
			File f = new File(ARQUIVO);
			FileInputStream fis = new FileInputStream(f);
			Scanner scanner = new Scanner(fis);
			ArrayList<Pessoa> colecaoPessoas = new ArrayList<>();
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String[] arrPessoa = linha.split(";");
				Pessoa p = new Pessoa(arrPessoa[0], arrPessoa[1], arrPessoa[2], Integer.parseInt(arrPessoa[3]));
				colecaoPessoas.add(p);
			}
			scanner.close();
			return colecaoPessoas;

		} catch (IOException e) {
			System.out.println("Erro ao ler " + ARQUIVO);

		}

		return null;
	}
}
