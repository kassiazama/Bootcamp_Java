package sequencial;

public class Variaveis {

	public static void main(String[] args) {
		
		int quantidade = 1500;
		float valorMercadoria = 750.28f;
		double peso = 38.3;
		char genero = 'F';
		
		System.out.printf(" A quantidade de itens em estoque � %d\n",quantidade);
		System.out.printf(" O valor da parcela � R$%.1f\n", valorMercadoria);
		System.out.printf(" A K�ssia pesa %.2f kg\n",peso);
		System.out.printf(" Do g�nero %c tem matriculados %d alunas", genero, quantidade);
	}
}
