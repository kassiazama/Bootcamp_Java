package sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4;
		int peso1 = 2;
		int peso2 = 2;
		int peso3 = 3;
		int peso4 = 4;
		double somaPeso = peso1 + peso2 + peso3 + peso4;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de n1: ");
		n1 = sc.nextInt();
		
		System.out.println("Informe o valor de n2: ");
		n2 = sc.nextInt();
		
		System.out.println("Informe o valor de n3: ");
		n3 = sc.nextInt();
		
		System.out.println("Informe o valor de n4: ");
		n4 = sc.nextInt();
		
		
		double mediaPonderada = ((n1 * peso1 + n2 * peso2 + n3 * peso3 + n4 * peso4)/somaPeso);
		System.out.printf("A média ponderada é de %.2f" , mediaPonderada);
		
		sc.close();

	}

}
