package paylivre.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nome;
		List<Float> nota1 = new ArrayList<>();
		List<Float> nota2 = new ArrayList<>();
		float not1;
		float not2;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantas notas deseja registrar? ");
		int qtt = sc.nextInt();
		
		for (int i=0; i<qtt;i++) {
			System.out.println("Digite a nota 1");
			not1 = sc.nextFloat();
			nota1.add(not1);
			System.out.println("Digite a nota 2");
			not2 = sc.nextFloat();
			nota2.add(not2);
		}
		float n1 = 0;
		int controler = 0;
		for (int i=0; i<nota1.size();i++) {
			n1 = n1+nota1.get(i);
			controler++;
		}
		float medias = n1/controler;
		System.out.println("Notas 1: "+nota1);
		System.out.println("Média: "+medias);
		if(medias>=6) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Aluno reprovado");
		}
		System.out.println("------------------");
		n1 = 0;
		controler = 0;
		for (int i=0; i<nota2.size();i++) {
			n1 = n1+nota2.get(i);
			controler++;
		}
		medias = n1/controler;
		
		System.out.println("Notas 2: "+nota2);
		System.out.println("Média: "+medias);
		if(medias>=6) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Aluno reprovado");
		}
}
}
