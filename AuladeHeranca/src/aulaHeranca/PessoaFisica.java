package aulaHeranca;
import java.util.Scanner;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String rg;
	
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
	
	public static void main (String[]args) {
		
		PessoaFisica pessoa = new PessoaFisica();
		PessoaFisica pessoaScaneada = new PessoaFisica();
		
		pessoa.setNome("Aurelion Sol");
		pessoa.setBairro("Pipoca Paulista");
		pessoa.setEndereco("Rua Bolinhas");
		pessoa.setRg("5343067819");
		pessoa.setCpf("32155327829");
		
		System.out.println("Nome: "+pessoa.getNome()+"\nBairro: "+pessoa.getBairro()+"\nEndereço: "+pessoa.getEndereco()+"\nCPF: "+pessoa.getCpf()+"\nRG: "+pessoa.getRg());
		
		//SCANNER
		System.out.println("\nSCANNER\n");
		
		Scanner scaninho = new Scanner(System.in);
		
		System.out.print("Nome: ");
		pessoaScaneada.setNome(scaninho.nextLine());
		
		System.out.print("Bairro: ");
		pessoaScaneada.setBairro(scaninho.nextLine());
		
		System.out.print("Endereço: ");
		pessoaScaneada.setEndereco(scaninho.nextLine());
		
		System.out.print("RG: ");
		pessoaScaneada.setRg(scaninho.nextLine());
		
		System.out.print("CPF: ");
		pessoaScaneada.setCpf(scaninho.nextLine());
		
		System.out.println("\nNome: "+pessoaScaneada.getNome()+"\nBairro: "+pessoaScaneada.getBairro()+"\nEndereço: "+pessoaScaneada.getEndereco()+"\nCPF: "+pessoaScaneada.getCpf()+"\nRG: "+pessoaScaneada.getRg());
		
		
		
		
		
	}
	
}
