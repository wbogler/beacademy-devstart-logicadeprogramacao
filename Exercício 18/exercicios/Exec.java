package paylivre.exercicios;

public class Exec {
	private String usuario = "Marcos";
	private int senha = 1234;
	
	public Exec() {
		
	}
	
	public boolean usuario(String user) {
		if(usuario.equals(user)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean senha(int keyUser) {
		if(senha == keyUser) {
			return true;
		}else {
			return false;
		}
	}
}
