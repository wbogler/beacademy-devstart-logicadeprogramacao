package paylivre.exercicios;

public class Exec {
	
	private String nome;
	private String cpf;
	private String Endere�o;
	private String Telefone;
	public Exec() {
		
	}
	@Override
	public String toString() {
		return "Exec [nome=" + nome + ", cpf=" + cpf + ", Endere�o=" + Endere�o + ", Telefone=" + Telefone + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
	
	
}
