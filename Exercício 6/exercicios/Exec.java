package paylivre.exercicios;

public class Exec {
	
	private String nome;
	private int idade;
	public Exec(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void avaliaIdade() {
		if(idade<18) {
			System.out.println(nome+" � menor de idade");
		}else if(idade>60) {
			System.out.println(nome+" � idoso");
		}else {
			System.out.println(nome+" � adulto");
		}
	}
	
	

}
