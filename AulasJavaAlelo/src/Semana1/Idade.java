package Semana1;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Qual é a sua idade?");

        int idade = in.nextInt();
        if (idade >= 18) {
            System.out.println("clique aqui");

        } else {
            System.out.println(" não clique aqui");
        }

        in.close();


    }

}

