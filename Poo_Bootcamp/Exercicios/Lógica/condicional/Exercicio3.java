package condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int diasDaSemana = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro entre 1 e 7: ");
		diasDaSemana = sc.nextInt();
		
		switch(diasDaSemana) {
		
		case 1: 
			System.out.println("\nDomingo");
			break;
			
		case 2: 
			System.out.println("\nSegunda-feira");
			break;
			
		case 3: 
			System.out.println("\nTer�a-feira");
			break;
			
		case 4: 
			System.out.println("\nQuarta-feira");
			break;
			
		case 5: 
			System.out.println("\nQuinta-feira");
			break;
			
		case 6: 
			System.out.println("\nSexta-feira");
			break;
			
		case 7: 
			System.out.println("\nS�bado-feira");
			break;
		
		default: 
			System.out.println("\nOp��o inv�lida");
		
		}
		
		sc.close();
	}

}
