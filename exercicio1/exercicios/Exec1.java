package paylivre.exercicios;

public class Exec1 {
	
	private String nome;
	private float peso;
	private float altura;
	
	public Exec1(String nome, float peso, float altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void dados() {
		System.out.println("nome: " + nome);
		System.out.println("peso: " + peso+ " Kg");
		System.out.println("altura: " + altura+ " cm");
	}

}
