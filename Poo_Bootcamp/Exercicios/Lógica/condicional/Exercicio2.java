package condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double salario, descontoIr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor da renda?");
		salario = sc.nextDouble();
		
		if (salario <= 1903.98) {
			System.out.println("\nO salário está abaixo de R$1903,98.");
		}else if (salario < 2826.66) {
			descontoIr = salario * 0.075;
		}else if (salario < 3751.07) {
			descontoIr = salario * 0.15;
		}else if (salario < 4664.69) {
			descontoIr = salario * 0.225;
		}else {
			descontoIr = salario * 0.275;
		}

		System.out.printf("\nO desconto de IR será de R$%.2f.", descontoIr);
		
		sc.close();
}
}
