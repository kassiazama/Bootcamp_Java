

package desafio;

import java.util.Scanner;


public class Desafio {

    
    public static void main(String[] args) {
        
        int passageiros;
        double tanque, consumo, km, valor;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantidade de passageiros: ");
        passageiros = sc.nextInt();
        System.out.println("Capacidade do tanque: ");
        tanque = sc.nextDouble();
        System.out.println("Consumo por litro: ");
        consumo = sc.nextDouble();
        System.out.println("Distância em km");
        km = sc.nextDouble();
        System.out.println("Valor do combusível");
        valor = sc.nextDouble();
        
        Veiculo veiculo1 = new Veiculo(tanque, consumo, passageiros);
        System.out.println(veiculo1.toString());
        
        double tanques = veiculo1.tanqueViagem(km);
        double rateio = veiculo1.dividirDespesas(km, valor);
        System.out.printf("Para a viagem vamos precisar de %.1f tanque(s) e cada passageito contribuirá com R$ %.2f\n", tanques, rateio);
         
    }

}
