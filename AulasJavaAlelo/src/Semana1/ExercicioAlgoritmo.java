package Semana1;

import java.util.Scanner;

public class ExercicioAlgoritmo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        int numero1 = in.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = in.nextInt();
        if (numero1 < numero2) {
            System.out.println("primeiro menor");
        } else {
            System.out.println("segundo menor");


        }
        in.close();
    }
}
