package Aula;

public class PessoaFisica extends Pessoa {

	private String rg;
	private String cpf;
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public static void main (String[] args) {
		
		PessoaFisica Pessoa = new PessoaFisica();
		
		Pessoa.setNome("Matheus");
		Pessoa.setEndereco("Catléias");
		Pessoa.setBairro("Pantanal");
		Pessoa.setCpf("4701568796489");
		Pessoa.setRg("456464564");
		
		System.out.println(Pessoa.getNome());	
		System.out.println(Pessoa.getEndereco());	
		System.out.println(Pessoa.getBairro());	
			
	}
}
