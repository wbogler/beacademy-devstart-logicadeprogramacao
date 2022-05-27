package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int operacao;
		float num1;
		float num2;
		boolean valid = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(valid == true) {
			System.out.println("Digite 1 somar");
			System.out.println("Digite 2 subtrair");
			System.out.println("Digite 3 multiplicar");
			System.out.println("Digite 4 dividir");
			System.out.println("Digite 5 sair");
			operacao = sc.nextInt();
			System.out.println("Digite o primeiro numero");
			num1 = sc.nextFloat();
			System.out.println("Digite o segundo numero");
			num2 = sc.nextFloat();
			Exec exercicio1 = new Exec(num1,num2);
			switch (operacao) {
			case 1:
				System.out.println("Soma é: ");
				System.out.println(exercicio1.soma()); 
				break;
			case 2:
				System.out.println("Subtração é: ");
				System.out.println(exercicio1.sub());
			case 3:
				System.out.println("Multiplicação é: ");
				System.out.println(exercicio1.mult());
			case 4:
				System.out.println("Divisão é: ");
				System.out.println(exercicio1.div());
			case 5:
				System.out.println("Saindo!");
				valid = false;
			default:
				System.out.println("Digite uma operação válida");
				break;
			}
		}
			
		
			
		}
	

}
