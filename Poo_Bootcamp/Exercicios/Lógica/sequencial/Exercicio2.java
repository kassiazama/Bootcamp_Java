package sequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double salario;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salário do funcionário: ");
		salario = sc.nextDouble();
		
		double salarioDesconto = salario * (1 - 0.11);
		
		System.out.printf("O salário com o desconto do INSS é de R$%.2f", salarioDesconto);
        
		sc.close();
	}

}
