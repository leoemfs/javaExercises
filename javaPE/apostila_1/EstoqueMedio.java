import java.util.Scanner;

public class EstoqueMedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdMin;
		int qtdMax;
		int estMedio;
		int qtdEst;
		
		System.out.println("Qual a quantidade minima do produto: ");
		qtdMin = sc.nextInt();
		System.out.println("Qual a quantidade maxima do produto: ");
		qtdMax = sc.nextInt();
		
		estMedio = (qtdMin + qtdMax) / 2;
		
		System.out.println("A quantidade media de estoque do produto é: " + estMedio);
		
		System.out.println("Qual a quantidade do produto: ");
		qtdEst = sc.nextInt();
		
		System.out.println("A quantidade em estoque do produto é: " + qtdEst);
		
		if(qtdEst <= estMedio) {
			System.out.println("Deve reabastecer seus produtos.");
		}
		sc.close();
	}

}
