package repeticao;

import java.util.Scanner;

public class mediaDeAlunos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		int contador = 0;
		
		while(contador <= 9) {
			System.out.printf("\nDigite a %dª nota:\n", contador+1);
			double nota = sc.nextDouble();
			total += nota;
			contador++;
		}
		
		double media = total / contador;
		
		System.out.printf("\nTotal de todas as notas é %.1f", total);
		System.out.printf("\nTotal de alunos %d", contador);
		System.out.printf("\nMédia da classe é %.1f", media);
		
		sc.close();
		
	}

}
