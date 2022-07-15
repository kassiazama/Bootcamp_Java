

package aplicacao;

import entidades.Aluno;
import java.util.Scanner;


public class Aluno2Main {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Data de Nascimento (dd/mm/yyy): ");
        String nascimento = sc.nextLine();
        
        System.out.println("Data de Matrícula (dd/mm/yyyy)");
        String matricula = sc.nextLine();
        
        Aluno aluno = new Aluno(nome, nascimento, matricula);
        System.out.println(aluno);
        
    }

}
