package paylivre.exercicios;

public class Exec {
		
	public Exec() {
		
	}
	
	public void quadrado(float num1, float num2, float num3, float num4) {
		float operacao = num1+num2+num3+num4;
		System.out.println("Per�metro: " + operacao);
		operacao = 0;
		operacao = num1*num2;
		System.out.println("�rea: "+operacao);
		
	}

	public void triangulo(float base, float num2, float num3, float altura) {
		float operacao = base+num2+num3;
		System.out.println("Per�metro: " + operacao);
		operacao = (base*altura)/2;
		System.out.println("�rea: "+operacao);
	
	}
/*Crie um programa que receba do usu�rio a
figura geom�trica que deseja calcular a �rea e
o per�metro (Q-Quadrado ou T-Tri�ngulo) e
calcule e exiba a �rea e o per�metro da figura
escolhida.*/
	
	

}
