package condicional;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {

		char genero;

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o g�nero (F ou M):");
		genero = sc.next().charAt(0);
		genero = Character.toUpperCase(genero);

		System.out.println((genero == 'F') ? "\nFeminino" : (genero == 'M') ? "\nMasculino" : "\nValor inv�lido");

		sc.close();

	}

}
