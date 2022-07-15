package condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		String disciplina, resultado = null;
		double aulasLecionadas, aulasFaltas, bim1, bim2, bim3, bim4;
		final double mediaAprovacao = 6.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome da disciplina:");
		disciplina = sc.next();
		
		System.out.println("Informe a quantia de aulas lecionadas:");
		aulasLecionadas = sc.nextInt();
		
		System.out.println("Informe a quantia de faltas:");
		aulasFaltas = sc.nextInt();
		
		System.out.println("Qual a nota do 1� bimestre:");
		bim1 = sc.nextDouble();
		
		System.out.println("Qual a nota do 2� bimestre:");
		bim2 = sc.nextDouble();
		
		System.out.println("Qual a nota do 3� bimestre:");
		bim3 = sc.nextDouble();
		
		System.out.println("Qual a nota do 4� bimestre:");
		bim4 = sc.nextDouble();
		
		double mediaBim = (bim1 + bim2 + bim3 + bim4) / 4;
		double verificacaoFaltas = 0.75 * aulasLecionadas;
		double porcentagemPresen�a = 100 - ((aulasFaltas / aulasLecionadas) * 100);

		
		if (mediaBim >= mediaAprovacao && aulasFaltas <= verificacaoFaltas){
			resultado = "Parab�ns, aprovado!";
		}else if (mediaBim >= mediaAprovacao && aulasFaltas > verificacaoFaltas){
			resultado = "Reprovou por falta!";
		}else if (mediaBim < mediaAprovacao && aulasFaltas <= verificacaoFaltas){
			resultado = "Reprovado por m�dia.";
		}else{
			resultado = "favor, checar as informa��es";
		}
		
		
		System.out.printf("Na disciplina %s, o aluno obteve m�dia %.1f e a porcentagem de presen�a foi de %.1f. \n%s", disciplina, mediaBim, porcentagemPresen�a, resultado);
		
		
		sc.close();
		

	}

}
