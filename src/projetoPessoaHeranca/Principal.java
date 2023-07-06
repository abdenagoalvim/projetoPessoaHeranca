package projetoPessoaHeranca;

public class Principal {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("111.222.333-44", "Josefino");
		pf1.setEndereco("Rua Sete, 25 - Centro");
		pf1.setEmail("josefino@email.com");
		pf1.setFone("(31)98888-1010");
		System.out.println(pf1);
		
		PessoaJuridica pj1 = new PessoaJuridica("11.222.333/0001-44", "Tem Tudo do Fino");
		pj1.setEndereco("Rua Sete, 25 - Centro");
		pj1.setEmail("temtudofino@email.com");
		pj1.setFone("(31)98888-1515");
		pj1.setContato("Josefino");
		System.out.println(pj1);
	}

}
