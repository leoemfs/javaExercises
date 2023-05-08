import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {
	private char[] gabarito = new char[10];
	private ArrayList<Candidato> candidatos = new ArrayList<>();
	
	public Concurso() {}
	//construtor de um concurso o qual so recebe um vetor de char gabarito[]
	public Concurso(char[] gabarito) {
		this.gabarito = gabarito;
	}
	
	
	//metodo de cadastro de candidato no array candidatos com validação de não repetição de cpf
	public void adicionarCandidato(Candidato candidato) {
		//primeiro uma variavel booleana iniciada em false (não há repetição de cpf) 
		boolean cpfJaCadastrado = false;
		//quando essa variavel for true há uma repetição
		
		//usando um for each para percorrer o arraylist candidatos
		
		//   tipoElemento //elemento //colecao/array
		for (Candidato        c :       candidatos) {
			//usando if para vlidar igualdade de cpf
			if(c.getCpf().equals(candidato.getCpf())) {
				//variavel booleana recebe true
				cpfJaCadastrado = true;
				break;
			}
		}
		//se a variavel booleana cpfJaCadastrado não for true
		if(!cpfJaCadastrado) {
			candidatos.add(candidato);
		}else {
			System.out.println("CPF já cadastrado!");
		}
	}//fim do metodo adicionarCandidato()
	
	
	//metodo para remover um candidato pelo cpf do mesmo
	public void removerCandidato(String cpf) {
		//usando um dor para percorrer o arraylist candidatos
		for(Candidato c : candidatos) {
			//verificar se o cpf do candidato a ser removido é igual ao cpf digitado para remoção usando um if
			if(c.getCpf().equals(cpf)) {
				//se for igual faça atraves do "remove" class do ArrayList
				candidatos.remove(c);
				//usando o "return" pois assim que for removido encerra o laço
				return;
			}
		}
		//caso não haja um cpf no array igual ao informado faça
		System.out.println("CPF informado não encontrado.");
	}//fim do metodo removeCandidato()
	
	
	//metodo para settar o gabarito
	//vou fazer igual a atividade da prof pede, mas poderia ser um setGabarito(char[] gabarito)com validações para ser entre A & E
	public void adicionarRespostasAoGabarito() {
		//scanner para pegar os valores informados né 
		Scanner sc = new Scanner(System.in);
		//mensagem ao usuario
		System.out.println("Digite as 10 respostas do gabarito (opções válidas: a, b, c, d, e): ");
		//usando um for para settar as repostas no vetor gabarito[10]
		for (int i = 0; i <gabarito.length; i++) {
			char resposta = sc.nextLine().charAt(0);
			//validando se esta dentro dos valores considerados validoes (opções validas: a, b, c, d, e)
			//se for diferente do que e valido faca
			while(resposta != 'a' && resposta != 'b' && resposta != 'c' && resposta != 'd' && resposta != 'e') {
				System.out.println("Resposta inválida! Digite novamente uma resposta válida opções válidas: a, b, c, d, e).");
				resposta = sc.nextLine().charAt(0);
			}
			gabarito[i] = resposta;	
		}
		sc.close();
	}
	//agora vou implementa o metodo corrigirProvas()
	public void corrigirProvas() {
		for(Candidato c : candidatos) {
			//vetor para receber as respostas do candidato
			char[] respostasCandidato = c.getRespostas();
			//variavel para receber acertos do candidato
			int acertos = 0;
			//mais um for, esse para comparar vetor gabarito[] com vetor respostasCandidato[]
			for(int i = 0; i < gabarito.length; i++) {
				//comparando igualdade por posição
				if(respostasCandidato[i] == gabarito[i]) {
					acertos++;
				}
			}
			System.out.println("Candidato: " + c.getNome() + "\n" + "CPF: " + c.getCpf() + "\n" + "Acertos: " + acertos);
		}
	}
	
	//metodo para corrigir prova de um candidato especifico passado como parametro
	public void corrigirProva(Candidato candidato) {
		int acertos = 0;
		for(int i = 0; i < gabarito.length; i++) {
			if (candidato.getRespostas()[i] == gabarito[i]) {
				acertos++;
			}
		}
		System.out.println("Resultado de acertos para o candidato: " + candidato.getNome() + " de CPF: " + candidato.getCpf() +  "é: " + acertos);
	}
	
	//imprimir o candidato da pra fazer o mesmo que foi feito acima
	public void imprimirCandidatos() {
		// percorrendo array de candidatos
	    for (Candidato candidato : candidatos) {
	    	//guardando numero de acertos
	        int acertos = 0;
	        //comparando respostas com o gabarito
	        for (int i = 0; i < gabarito.length; i++) {
	            if (candidato.getRespostas()[i] == gabarito[i]) {
	                acertos++;
	            }
	        }
	        //imprimindo usando marcadores de posição, usava em c e da pra usar em java tbm achei interessante 
	        System.out.printf("Nome: %s, CPF: %s, Acertos: %d\n", candidato.getNome(), candidato.getCpf(), acertos);
	    }
	    
	}


	public char[] getGabarito() {
		return gabarito;
	}


	public void setGabarito(char[] gabarito) {
		this.gabarito = gabarito;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}