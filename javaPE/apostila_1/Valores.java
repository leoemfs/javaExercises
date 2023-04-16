import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		
		int[] numeros = new int[4];
		Scanner scanner = new Scanner(System.in);

		// Lendo os quatro valores inteiros
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			numeros[i] = scanner.nextInt();
		}

		// Realizando as operações de soma e multiplicação dois a dois
		System.out.println("Resultados da soma e multiplicação dois a dois:");
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 4; j++) {
		    	System.out.println(numeros[i] + " + " + numeros[j] + " = " + (numeros[i]+numeros[j]));
		        System.out.println(numeros[i] + " x " + numeros[j] + " = " + (numeros[i]*numeros[j]));
		    }
		}
	}	
}

