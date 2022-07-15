

package aplicacao;

import entidades.Produto;
import java.util.Scanner;


public class ProdutoMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe os dados do produto: ");
        System.out.println("Nome: ");
        String nome = sc.next();
        
        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        
        System.out.println("Preço: ");
        double valor = sc.nextDouble();
        
        Produto celular = new Produto(nome, valor, quantidade);
        
        System.out.printf("\n%s ",celular.nome);
        System.out.println(celular.quantidade + " unidades");
        System.out.printf("\nR$ %.2f",celular.valorUnitario);
        
        System.out.printf(" Imposto: R$ %.2f", celular.valorImposto());
        System.out.printf(" Total em estoque: R$ %.2f \n", celular.valorEstoque());
        
        
        
        
    }

}
