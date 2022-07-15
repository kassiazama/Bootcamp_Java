package triangulo;

import geometria.Triangulo;
import java.util.Scanner;

public class TrianguloExec {

    public static void main(String[] args) {

        Triangulo a = new Triangulo();
        Triangulo b = new Triangulo();
        
        entrada(a);
        if (a.validar() == true) {
            System.out.println(a.toString());
        } else {
            System.out.println("\nOs lados informados não representam o triangulo");
        }

        //Triangulo B
        entrada(b);
        if (b.validar() == true) {
            System.out.println(b);
        } else {
            System.out.println("\nOs lados informados não representam o triangulo");
        }

    }

    public static void entrada(Triangulo lado) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores dos lados: ");
        lado.x = sc.nextDouble();
        lado.y = sc.nextDouble();
        lado.z = sc.nextDouble();
    }

}
