package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int opcao;
		double num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro valor:");
		num1 = sc.nextDouble();
		
		System.out.println("\nInforme o segundo valor:");
		num2 = sc.nextDouble();
		
		System.out.println("\nCalculadora");
		System.out.println("\n1. Soma \n2. Subtra��o \n3. Multiplica��o \n4. Divis�o");
		System.out.println("\nEscolha uma op��o: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1: 
			System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, num1 + num2);
			break;
		
		case 2: 
			System.out.printf("\n%.2f - %.2f = %.2f", num1, num2, num1 - num2);
			break;
			
		case 3: 
			System.out.printf("\n%.2f * %.2f = %.2f", num1, num2, num1 * num2);
			break;
			
		case 4: 
			System.out.printf("\n%.2f / %.2f = %.2f", num1, num2, num1 / num2);
			break;
		
		default : 
			System.out.println("\nOp��o inv�lida");
		}
		
		
		sc.close();

	}

}
