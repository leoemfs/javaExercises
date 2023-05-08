public class Candidato {
	//atributos da class
	private String nome;
	private String cpf;
	private char[] respostas = new char[10];
	
	//construtor de um candidato, obrigando que os candidatos tenham os seguintes dados informados
	public Candidato(String nome, String cpf, char[] respostas) {
		this.nome = nome;
		this.cpf = cpf;
		this.respostas = respostas;
	}
	
	
	//getters e setters da class
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char[] getRespostas() {
		return this.respostas;
	}
	public void setRespostas(char[] respostas) {
		this.respostas = respostas;
	}
	
}