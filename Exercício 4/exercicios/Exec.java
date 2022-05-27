package paylivre.exercicios;

public class Exec {
	
	private String nome;
	private float saldo = 100;
	
	
	public Exec(String nome) {
		this.nome = nome;
	}

	public void saldo() {
		System.out.println("Bem-vindo " + nome);
		System.out.println("Saldo atual: "+saldo);
	}
	
	public void deposito(float deposito) {
		saldo+=deposito;
		System.out.println("Seu depósito é de: "+deposito);
		System.out.println("Seu novo saldo: "+saldo);
		
	}
	
	


}
