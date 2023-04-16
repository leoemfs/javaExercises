import java.util.Scanner;

public class CotacaoDolarReal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cotDolar;
		double valorDolar;
		double valorReal;
		
		System.out.println("Digite a cotação atual do Dolar em relação ao real: ");
		cotDolar = sc.nextDouble();
		System.out.println("Cada Dolar vale: $" + cotDolar + " para cada R$1.00");
		
		System.out.println("Digite um valor em Dolares: ");
		valorDolar = sc.nextDouble();
		
		valorReal = valorDolar * cotDolar;
		
		System.out.println("$" + valorDolar + " correspode a: R$" + valorReal);
		
		sc.close();
	}

}
