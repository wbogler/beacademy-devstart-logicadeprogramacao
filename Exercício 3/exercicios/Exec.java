package paylivre.exercicios;

public class Exec {
	
	private String nome;
	private int idade;
	private boolean validacao;
	
	public Exec(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void comparaIdade() {
		
		System.out.println("Bem-vindo " + nome);
		System.out.println("Voc� tem "+idade+" anos.");
		System.out.println();
		if (idade>18) {
			validacao = true;
			System.out.println("Sua idade � maior que 18 anos: "+validacao);
		}
		if (idade!= 25) {
			validacao = false;
			System.out.println("Sua idade � diferente de 25 anos: "+validacao);
		}
		if((idade != 25) && (nome.equals("marcos"))) {
			validacao = false;
			System.out.println("Sua idade � diferente de 25 anos e seu nome � Marcos: "+validacao);
		}
		if((idade != 25)||(nome.endsWith("marcos"))) {
			validacao = true;
			System.out.println("Sua idade � diferente de 25 anos ou o seu nome � Marcos: "+validacao);
		}
		if((idade/2)==0) {
			validacao = true;
			System.out.println("Sua idade dividida por 2 � zero? "+validacao);
		}
	}
	
	


}
