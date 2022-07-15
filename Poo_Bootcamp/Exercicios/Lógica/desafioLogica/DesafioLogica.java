package desafioLogica;

import java.util.Scanner;

public class DesafioLogica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		double precoUnitC, totalPUC = 0, precoUnitE, totalPUE = 0, precoUnitV, totalPUV = 0;
		int qntC, qntTotalC = 0, qntE, qntTotalE = 0, qntV, qntTotalV = 0; 
		char produto;
		int contador;
		
		System.out.println("Cadastramento de produtos em estoque.\n As categorias de produtos s�o:\n C = Cama, Mesa e Banho\n E = Eletrodom�sticos\n V = Vestu�rios");
		for (contador = 0 ; contador <= 14; contador++) {
			System.out.println("Digite a categoria do produto:");
			produto = sc.next().charAt(0);
			produto = Character.toUpperCase(produto);
			
			if (produto == 'C') {
				System.out.println("Qual o pre�o unit�rio do produto?");
				precoUnitC = sc.nextDouble();
				System.out.println("Qual a quantia do produto?");
				qntC = sc.nextInt();
				totalPUC += precoUnitC;
				qntTotalC += qntC;
				
			}else if (produto == 'E') {
				System.out.println("Qual o pre�o unit�rio do produto?");
				precoUnitE = sc.nextDouble();
				System.out.println("Qual a quantia do produto?");
				qntE = sc.nextInt();
				totalPUE += precoUnitE;
				qntTotalE += qntE;
				
			}else if (produto == 'V') {
				System.out.println("Qual o pre�o unit�rio do produto?");
				precoUnitV = sc.nextDouble();
				System.out.println("Qual a quantia do produto?");
				qntV = sc.nextInt();
				totalPUV += precoUnitV;
				qntTotalV += qntV;
				
			}else {
				System.out.println("Categoria inv�lida");
			}
		}
		
		//al�quota e margem em vari�veis para facilitar futuras manuten��es 
		double aliquotaC = 37.41, aliquotaE = 43.14, aliquotaV = 38.42;
		double margemC = 30, margemE = 35, margemV = 50;
		
		double produtoImpC, produtoImpE, produtoImpV, produtoMargemC = 0, produtoMargemE = 0, produtoMargemV = 0, valorEstoqueC, valorEstoqueE, valorEstoqueV;
		
		produtoImpC = (totalPUC * qntTotalC) * (aliquotaC / 100);
		produtoImpE = (totalPUE * qntTotalE) * (aliquotaE / 100);
		produtoImpV = (totalPUV * qntTotalV) * (aliquotaV / 100);
		
		produtoMargemC = (totalPUC + qntTotalC) * (margemC / 100);
		produtoMargemE = (totalPUE * qntTotalE) * (margemE/ 100);
		produtoMargemV = (totalPUV * qntTotalV) * (margemV/ 100);
		
		valorEstoqueC = totalPUC * qntTotalC;
		valorEstoqueE = totalPUE * qntTotalE;
		valorEstoqueV = totalPUV * qntTotalV;
		
		System.out.println("\n\nRELAT�RIO: \n");
		System.out.printf("Quantia total de produtos �: %d.\n", contador);
		System.out.printf("\nConsiderando a al�quota de %.2f%%, o imposto sobre o total de produtos da categoria Cama, Mesa e Banho � R$%.2f.", aliquotaC, produtoImpC);
		System.out.printf("\nConsiderando a al�quota de %.2f%%, o imposto sobre o total de produtos da categoria Eletrodom�stico � R$%.2f.", aliquotaE, produtoImpE);
		System.out.printf("\nConsiderando a al�quota de %.2f%%, o imposto sobre o total de produtos da categoria Vestu�rio � R$%.2f.", aliquotaV, produtoImpV);
		
		System.out.printf("\n\nA margem de lucro sobre a categoria Cama, Mesa e Banho � R$%.2f.\n", produtoMargemC);
		System.out.printf("A margem de lucro sobre a categoria Eletrodom�stico � R$%.2f.\n", produtoMargemE);
		System.out.printf("A margem de lucro sobre a categoria Vestu�rio � R$%.2f.\n", produtoMargemV);
		
		System.out.printf("\nO valor total BRUTO dos produtos em estoque separados por categoria �:\nCama, Mesa e Banho: R$%.2f.\nEletrodom�stico: R$%.2f.\nVestu�rio: R$%.2f.", valorEstoqueC, valorEstoqueE, valorEstoqueV);
		
		sc.close();
			
		}
	}


