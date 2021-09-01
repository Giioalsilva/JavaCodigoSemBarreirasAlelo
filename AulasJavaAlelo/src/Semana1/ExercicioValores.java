package Semana1;

import java.util.Scanner;

public class ExercicioValores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        int numero1 = in.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = in.nextInt();
        System.out.println("Digite o terceiro número");
        int numero3 = in.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("primeiro é o maior");
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("segundo é o maior ");
        }

        else {
                System.out.println("terceiro é o maior");
            }

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println(" o primeiro é o menor");

        }
        else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("o segundo é o menor");

        }
        System.out.println("A media é " + (numero1 + numero2 + numero3)/3);



















    }
}
