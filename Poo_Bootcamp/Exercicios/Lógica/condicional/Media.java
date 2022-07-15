package condicional;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		n1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota:");
		n2 = sc.nextDouble();
		
		System.out.println("Informe a terceira nota:");
		n3 = sc.nextDouble();
		
		System.out.println("Informe a quarta nota:");
		n4 = sc.nextDouble();
		
		double media = ( n1 + n2 + n3 + n4) / 4;
		String resultado;
		
		if (media >= 6.0) {
			resultado = "aprovado :D ";	
		}else {
			resultado = "reprovado :( ";
		}
		
		System.out.printf("\nA média do aluno foi %.2f, %s", media, resultado);;
		
		sc.close();
	}

}
