import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProduto {
	
	//criando um array para armazenar o objeto
	private ArrayList<Produto> produtos;
	Scanner sc = new Scanner(System.in);
	//metodo para cadastrar um objeto produto
	public void cadastrarProduto() {
		produtos = new ArrayList<>();
		System.out.println("Cadastro de Produto");
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto novoProduto = new Produto(nome, preco, quantidade);
        //cadastro.adicionarProduto(novoProduto);

        System.out.println("Produto cadastrado com sucesso!");
	}
}
