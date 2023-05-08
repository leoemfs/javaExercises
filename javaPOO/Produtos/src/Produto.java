
public class Produto {
	//atributos do objeto
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	//constutor do objeto produto
	public Produto(String nome, double preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	//get e set da class
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return this.qtdEstoque;
	}
	public void setQtdEtoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
}
