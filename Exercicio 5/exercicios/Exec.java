package paylivre.exercicios;

public class Exec {
	
	private String nome;
	private float altura;
	private float peso;
	public Exec(String nome, float altura, float peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void calculaIMC() {
		float imc = peso/((altura/100)*(altura/100));
		
		if (imc<19) {
			System.out.println(nome+ " est� abaixo do peso");
		}else if(imc>=19 && imc <25) {
			System.out.println(nome+ " est� com peso normal");			
		} else if(imc>=25 && imc <30) {
			System.out.println(nome+ " est� com sobrepeso");
		} else if(imc>=30 && imc <40) {
			System.out.println(nome+ " est� com Obesidade tipo I");
		}else {
			System.out.println(nome+ " Obesidade m�rbida");
		}
	}


}
