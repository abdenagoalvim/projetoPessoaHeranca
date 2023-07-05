package projetoPessoaHeranca;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String contato;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String cnpj, String nome) {
		super(nome);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [\nCNPJ = " + cnpj + ", \nNome = " + getNome() + ", \nEndereco = " + getEndereco() 
			+ ", \nEmail = " + getEmail() + ", \nFone = " + getFone() + ", \nContato = " + contato + "\n]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
}
