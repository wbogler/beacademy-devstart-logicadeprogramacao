package paylivre.exercicios;

public class Exec {
	
	private String nome;
	private float peso;
	private float altura;
	
	public Exec(String nome, float peso, float altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void indiceMC() {
		altura /= 100;
		float imc = peso/(altura*altura);
		System.out.println("IMC = " + imc);
	}
	
	public void dados() {
		System.out.println("nome: " + nome);
		System.out.println("peso: " + peso+ " Kg");
		System.out.println("altura: " + altura+ " cm");
		System.out.println();
		indiceMC();
		
		
	}

}
