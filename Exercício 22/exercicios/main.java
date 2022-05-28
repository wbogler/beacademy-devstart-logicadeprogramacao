package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String produto;
		int preco;
		String[] produtos = new String[10];
		int[] precos = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<=9;i++) {
			System.out.println("Produto: ");
			produto = sc.next();
			sc.nextLine();
			System.out.println("Preço: ");
			preco = sc.nextInt();
			sc.nextLine();
			produtos[i] = produto;
			precos[i] = preco;
		}
		for (int i = 0; i<=9; i++) {
			System.out.println("Produto: "+produtos[i]);
			System.out.println("Preco: "+precos[i]);
			System.out.println("________________________");
		}


	}

}
