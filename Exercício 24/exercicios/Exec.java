package paylivre.exercicios;

public class Exec {
	
	private String nome;
	private String cpf;
	private String Enderešo;
	private String Telefone;
	public Exec() {
		
	}
	@Override
	public String toString() {
		return "Exec [nome=" + nome + ", cpf=" + cpf + ", Enderešo=" + Enderešo + ", Telefone=" + Telefone + "]";
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
	public String getEnderešo() {
		return Enderešo;
	}
	public void setEnderešo(String enderešo) {
		Enderešo = enderešo;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
	
	
}
