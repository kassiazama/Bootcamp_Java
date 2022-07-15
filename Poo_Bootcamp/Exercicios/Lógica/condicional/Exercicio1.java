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
		
		System.out.println("Qual a nota do 1° bimestre:");
		bim1 = sc.nextDouble();
		
		System.out.println("Qual a nota do 2° bimestre:");
		bim2 = sc.nextDouble();
		
		System.out.println("Qual a nota do 3° bimestre:");
		bim3 = sc.nextDouble();
		
		System.out.println("Qual a nota do 4° bimestre:");
		bim4 = sc.nextDouble();
		
		double mediaBim = (bim1 + bim2 + bim3 + bim4) / 4;
		double verificacaoFaltas = 0.75 * aulasLecionadas;
		double porcentagemPresença = 100 - ((aulasFaltas / aulasLecionadas) * 100);

		
		if (mediaBim >= mediaAprovacao && aulasFaltas <= verificacaoFaltas){
			resultado = "Parabéns, aprovado!";
		}else if (mediaBim >= mediaAprovacao && aulasFaltas > verificacaoFaltas){
			resultado = "Reprovou por falta!";
		}else if (mediaBim < mediaAprovacao && aulasFaltas <= verificacaoFaltas){
			resultado = "Reprovado por média.";
		}else{
			resultado = "favor, checar as informações";
		}
		
		
		System.out.printf("Na disciplina %s, o aluno obteve média %.1f e a porcentagem de presença foi de %.1f. \n%s", disciplina, mediaBim, porcentagemPresença, resultado);
		
		
		sc.close();
		

	}

}
