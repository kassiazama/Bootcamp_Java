package sequencial;

import java.util.Scanner;

public class Aumento2 {

	public static void main(String[] args) {
		
		
		double salarioBruto, percentual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio bruto: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		salarioBruto = salarioBruto * (1 + percentual /100);
		System.out.printf("O novo sal�rio bruto � de R$%.2f", salarioBruto);
		
		sc.close();
		
		
		// abaixo est� o desafio proposto pelo professor 
		
		/*double salarioBruto, percentual, novoSalario;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio bruto: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Informe o percentual de aumento: ");
		percentual = sc.nextDouble();
		
		novoSalario = salarioBruto * (1 + percentual /100);
		System.out.printf("O valor do sal�rio bruto � de R$%.2f e ap�s o aumento de %.1f, o novo sal�rio � de R$%.2f", salarioBruto, percentual, novoSalario);
		
		sc.close();
		*/
		
	}

}
