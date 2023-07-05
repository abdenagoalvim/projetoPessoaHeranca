package projetoPessoaHeranca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String email;
	private String fone;
	
	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [\nnome=" + nome + ", \nendereco=" + endereco + ", \nemail=" + email + ", \nfone=" + fone + "\n]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
}
