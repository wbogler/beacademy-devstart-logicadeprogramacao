package paylivre.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nome;
		List<Exec> lista = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		Exec exercicio = new Exec();
		
		for(int i=0; i<2; i++) {
			System.out.println("Nome:");
			exercicio.setNome(sc.next());
			System.out.println("CPF:");
			exercicio.setCpf(sc.next());
			System.out.println("Endereço:");
			exercicio.setEndereço(sc.next());
			System.out.println("Telefone:");
			exercicio.setTelefone(sc.next());
			lista.add(exercicio);
		}
		for (Exec exec : lista) {
			System.out.println(exec);
		}
		
		
}
}
