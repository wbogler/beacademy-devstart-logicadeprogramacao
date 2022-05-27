package paylivre.exercicios;

public class Exec {
	private float saldo = 150;
	
	public Exec() {
		
	}
	
	public float saldo() {
		return saldo;
	}
	
	public float transfer(float valor) {
		if(valor<=saldo) {
			saldo = saldo - valor;
			return saldo;
		}else {
			return -1000;
		}
	}
	
	public float deposito(float valor) {
		saldo =saldo + valor;
		return saldo;
	}
	
	public float saque(float valor) {
		if(valor<=saldo) {
			saldo = saldo- valor;
			return saldo;
		}else {
			return -1000;
		}
	}
}
