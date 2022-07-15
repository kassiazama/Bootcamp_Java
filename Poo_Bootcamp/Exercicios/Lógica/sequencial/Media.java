package sequencial;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		double n1, n2, n3;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de n1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Informe o valor de n2: ");
		n2 = sc.nextDouble();
		
		System.out.println("Informe o valor de n3: ");
		n3 = sc.nextDouble();
		
		
		double media = (n1+n2+n3)/3;
		System.out.printf("A média de %.3f, %.3f e %.3f é de %.3f", n1, n2, n3, media);
		
		
		sc.close();

	}

}
