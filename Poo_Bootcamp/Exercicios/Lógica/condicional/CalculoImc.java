package condicional;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		
		double peso, altura, resultadoImc;
		String classificacao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu peso:");
		peso = sc.nextDouble();
		
		System.out.println("Informe a sua altura");
		altura = sc.nextDouble();
		
		resultadoImc = peso / Math.pow(altura, 2);
		
		if (resultadoImc < 18.5) {
			classificacao = "abaixo do peso";
		}else if (resultadoImc < 25) {
			classificacao = "peso normal";
		}else if (resultadoImc < 30) {
			classificacao = "sobrepeso";
		}else if (resultadoImc < 35) {
			classificacao = "obesidade grau I";
		}else if (resultadoImc < 40) {
			classificacao = "obesidade grau II";
		}else{
			classificacao = "obesidade grau III";
		}
		
		System.out.printf("O seu IMC é de %.1f \nSua classificação é %s.", resultadoImc, classificacao);;
		
		sc.close();

	}

}
