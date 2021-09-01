package Semana1;

import java.util.Scanner;

public class ExercicioEleitores {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int somadosvotos = 0;


        System.out.println("Digite o número total de habitantes");
        int numerosdehabitantes = in.nextInt();
        System.out.println("Digite o número total de eleitores");
        int numerodeeleitores = in.nextInt();
        System.out.println("Digite o número de votos brancos");
        int votosbrancos = in.nextInt();
        System.out.println("Digite o número de votos nulos");
        int votosnulos = in.nextInt();
        System.out.println("Digite o número de votos válidos");
        int votosvalidos = in.nextInt();

        somadosvotos = somadosvotos + votosbrancos + votosnulos + votosvalidos;




        System.out.println(" O total de votos Brancos foram de %" + (votosbrancos * 100.000f / numerosdehabitantes ));
        System.out.println(" O total de votos nulos foram de %" + (votosnulos * 100.000f / numerosdehabitantes));
        System.out.println(" O total de votos válidos foram de % " + (votosvalidos * 100.000f / numerosdehabitantes));
        System.out.println(" O total de eleitores que não votaram " + (numerosdehabitantes - somadosvotos));

        in.close();


    }






















}
