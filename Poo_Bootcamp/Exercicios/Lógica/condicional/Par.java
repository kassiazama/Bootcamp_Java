package condicional;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Informe um n�mero: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O n�mero %d � par.\n", num);
		}
		
		System.out.println("\nEncerrando a execu��o");
		
		sc.close();

	}

}
