package projetoPessoaHeranca;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica() {
	}

	public PessoaFisica(String cpf, String nome) {
		super(nome);
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [\nCPF = " + cpf + ", \nNome = " + getNome() + ", \nEndereco = " + getEndereco()
				+ ", \nEmail = " + getEmail() + ", \nFone = " + getFone() + "\n]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
