package Aula_25_09;

public class PrincipalPessoa {

	public static void main(String[] args) {


		Pessoa pessoa = new Pessoa ("Giovana", "(11)9999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		PessoaFisica pessoa_fisica = new PessoaFisica ("Gustavo", "(11)9999-9999", "234.234.234.34", "34567-87");
		System.out.println("\nPessoa fisica: ");
		System.out.println("Nome: " + pessoa_fisica.getNome());
		System.out.println("Telefone: " + pessoa_fisica.getTelefone());
		System.out.println("CPF: " + pessoa_fisica.getCpf());
		System.out.println("RG: " + pessoa_fisica.getRg());

		PessoaJuridica pessoa_juridica = new PessoaJuridica ("Empresa", "(11)9999-9999","335677");
		System.out.println("\nPessoa jurídica: ");
		System.out.println("Nome: " + pessoa_juridica.getNome());
		System.out.println("Telefone: " + pessoa_juridica.getTelefone());
		System.out.println("CNPJ: " + pessoa_juridica.getCnpj());
	}
}



