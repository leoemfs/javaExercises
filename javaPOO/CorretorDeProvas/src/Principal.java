import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instanciando o objeto Concurso
        Concurso concurso = new Concurso();
        
        // Adicionando as respostas corretas ao gabarito do concurso
        concurso.setGabarito(new char[]{'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e'});
        
        // Solicitando o nome, CPF e respostas do candidato
        System.out.println("Digite o nome do candidato:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do candidato:");
        String cpf = scanner.nextLine();
        char[] respostas = new char[10];
        System.out.println("Digite as 10 respostas do candidato (a, b, c, d ou e):");
        for (int i = 0; i < respostas.length; i++) {
            char resposta = scanner.nextLine().charAt(0);
            while (resposta != 'a' && resposta != 'b' && resposta != 'c' && resposta != 'd' && resposta != 'e') {
                System.out.println("Resposta inválida. Digite novamente (a, b, c, d ou e):");
                resposta = scanner.nextLine().charAt(0);
            }
            respostas[i] = resposta;
        }
        
        // Instanciando o objeto Candidato
        Candidato candidato = new Candidato(nome, cpf, respostas);
        
        // Adicionando o candidato ao concurso
        concurso.adicionarCandidato(candidato);
        
        // Corrigindo as provas do concurso
        concurso.corrigirProvas();
        
        // Imprimindo os resultados dos candidatos
        concurso.imprimirCandidatos();
    }
}
