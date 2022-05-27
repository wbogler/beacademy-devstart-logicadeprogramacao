package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nome;
		float altura;
		float peso;
		
		Scanner sc = new Scanner(System.in);
		
		//coleta dos dados
		System.out.println("Digite o seu nome");
		nome = sc.nextLine();
		System.out.println("Digite sua altura em cm");
		altura = sc.nextFloat();
		System.out.println("Digite seu peso kg");
		peso = sc.nextFloat();
		sc.close();
		
		
		Exec exercicio1 = new Exec(nome,altura,peso);
		exercicio1.calculaIMC();

	}

}
