package paylivre.exercicios;

public class Exec {
	
	private float saldo = 150;
	
	public Exec() {
		
	}
	public Exec(float saldo) {
		this.saldo = saldo;
	}
	
	
	public float deposito(float valorDep) {
		saldo+=valorDep;
		return saldo;
	}
	
	public float saldo() {
		return saldo;
	}
	
	public float saque(float saque) {
		if(saque<saldo) {
			saldo = saldo-saque;
			return saldo;
		}else {
			return -1000;
		}
	}
	

	
	

}
