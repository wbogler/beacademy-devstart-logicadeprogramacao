package paylivre.exercicios;

public class Exec {
		
	public Exec() {
		
	}
	
	public void quadrado(float num1, float num2, float num3, float num4) {
		float operacao = num1+num2+num3+num4;
		System.out.println("Perímetro: " + operacao);
		operacao = 0;
		operacao = num1*num2;
		System.out.println("Área: "+operacao);
		
	}

	public void triangulo(float base, float num2, float num3, float altura) {
		float operacao = base+num2+num3;
		System.out.println("Perímetro: " + operacao);
		operacao = (base*altura)/2;
		System.out.println("Área: "+operacao);
	
	}
/*Crie um programa que receba do usuário a
figura geométrica que deseja calcular a área e
o perímetro (Q-Quadrado ou T-Triângulo) e
calcule e exiba a área e o perímetro da figura
escolhida.*/
	
	

}
