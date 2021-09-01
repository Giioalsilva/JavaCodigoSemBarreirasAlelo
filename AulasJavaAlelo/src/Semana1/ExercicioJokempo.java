package Semana1;

import java.util.Scanner;

public class ExercicioJokempo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String operacao1 = "pedra";
        String operacao2 = "papel";
        String operacao3 = "tesoura";

        System.out.println("Bora jogar JokemmmmmmmPôoooo!!!");
        System.out.println("Jogador 1 qual é a sua escolha? (pedra, papel ou tesoura)");
        String opcaojogador1 = in.next();
        System.out.println("Jogador 2 qual é a sua escolha? (pedra, papel ou tesoura)");
        String opcaojogador2 = in.next();
        if (opcaojogador1.equals(opcaojogador2)) {
            System.out.println("DEU Empate");

        }
        else if (opcaojogador1.equals(operacao1) && opcaojogador2 .equals(operacao2)) {
            System.out.println("Jogador 1 ganhou");
        }
        else if (opcaojogador1 .equals(operacao1) && opcaojogador2 .equals(operacao3)) {
            System.out.println("Jogador 2 ganhou");

            in.close();
        }




    }
}
