package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabuada;
		
		System.out.println("Digite o numero que deseja a tabuada:");
		tabuada = sc.nextInt();
		
		for (int i = 0; i<=10; i++) {
			System.out.println(tabuada+" x "+ i + " = "+ i*tabuada);
		}
			
		}


}
