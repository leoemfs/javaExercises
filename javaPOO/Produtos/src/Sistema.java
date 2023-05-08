import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Descrição: Crie um sistema que permita o cadastro de produtos. 
		 * Cada produto deve ter um nome, um preço e uma quantidade em estoque. 
		 * O sistema deve permitir a adição de novos produtos, 
		 * a remoção de produtos existentes e a atualização das informações de um produto. 
		 * O sistema deve também permitir a exibição da lista de todos os produtos cadastrados.
		 */
		Scanner sc = new Scanner(System.in);
		
		String menu = "---------Sistema de cadastro e pesquisa de produto---------\n"
				+ "1- Cadastrar um novo produto.\n"
				+ "2- Remover um produto.\n"
				+ "3- Exibir produtos cadastrados em estoque.\n"
				+ "0- Sair do sistema.";
		
		int option;
		do {
			System.out.println(menu);
			//verificar se o usuario digitou uma opção valida
		    while (!sc.hasNextInt()) {
		    System.out.println("Opção inválida. Por favor, digite um número inteiro.");
		    sc.next();
		    }
		    option = sc.nextInt();
		    
		    switch (option) {
		    case 1:
		    	
		    }
		}while(option !=0);
	}

}
