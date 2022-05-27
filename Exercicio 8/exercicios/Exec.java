package paylivre.exercicios;

public class Exec {
	
	private float num1;
	private float num2;
	
	public Exec() {
		
	}

	public Exec(float num1, float num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public float soma() {
		return num1+num2;
	}
	
	public float sub() {
		return num1-num2;
	}
	
	public float mult() {
		return num1*num2;
	}
	
	public float div() {
		if(num2 == 0) {
			return 0;
		}else {
			return num1/num2;
		}
	}

	
	

}
