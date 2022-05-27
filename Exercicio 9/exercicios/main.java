package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String operacao;
		float num1;
		float num2;
		float base;
		float altura;
		
		Scanner sc = new Scanner(System.in);
		
		//coleta dos dados
		Exec exercicio1 = new Exec();
		System.out.println("Digite Q para quadrado");
		System.out.println("Digite T para triangulo");
		operacao = sc.nextLine();
		operacao.toString();
		if(operacao.equals("q")) {
			System.out.println("Digite um lado");
			num1 = sc.nextFloat();
			System.out.println("Digite outro lado");
			num2 = sc.nextFloat();
			System.out.println("Digite outro lado");
			base = sc.nextFloat();
			System.out.println("Digite outro lado");
			altura = sc.nextFloat();
			exercicio1.quadrado(num1, num2, base, altura);
		}else if(operacao.equals("t")){
			System.out.println("Digite a base");
			base = sc.nextFloat();
			System.out.println("digite a altura");
			altura = sc.nextFloat();
			System.out.println("Digite um lado lado");
			num1 = sc.nextFloat();
			System.out.println("Digite outro lado");
			num2 = sc.nextFloat();
			exercicio1.triangulo(base, num1, num2, altura);
		}else {
			System.out.println("Operação inválida");
		}
		sc.close();
			
		}


}
