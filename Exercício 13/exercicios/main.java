package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = sc.nextInt();
				
		System.out.println("Multiplos de 3");
		for (int i = num1; i<=num2; i++) {
				if (i%3 == 0) {
				System.out.println(i);
			}
		}
			
		}


}
