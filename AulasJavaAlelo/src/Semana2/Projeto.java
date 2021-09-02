package Semana2;

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {


        double saldoAlimentacao = 0.0;
        double saldoTransporte = 0.0;
        double saldoRefeicao = 0.0;
        double valorGastoalimentacao = 0.0;
        double valorGastorefeicao = 0.0;
        double valorGastoTransporte = 0.0;
        int operacao = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores do saldo de cada beneficio que serão usados:");

        System.out.println("Digite o saldo do vale alimentação:");
        saldoAlimentacao = scanner.nextDouble();

        System.out.println("Digite o saldo do vale transporte:");
        saldoTransporte = scanner.nextDouble();

        System.out.println("Digite o saldo do vale refeição:");
        saldoRefeicao = scanner.nextDouble();


        System.out.println("Escolha qual transação deseja fazer:");
        System.out.println("1 - Alimentação, 2 - Transporte, 3 - Refeição");
        operacao = scanner.nextInt();

        if (operacao == 1) {
            System.out.println("Digite o valor da compra no cartão alimentação: ");
            valorGastoalimentacao = scanner.nextDouble();
            if (valorGastoalimentacao <= saldoAlimentacao) {
                System.out.println("Sua compra foi aprovada");
                saldoAlimentacao = saldoAlimentacao - valorGastoalimentacao;
            } else if (valorGastoalimentacao > saldoAlimentacao) {
                System.out.println("Sua compra foi negada, pois falta saldo");

            }
        }

        if (operacao == 2) {
            System.out.println("Digite o valor da compra no cartão refeição: ");
            valorGastoalimentacao = scanner.nextDouble();
            if (valorGastoalimentacao <= saldoRefeicao) {
                System.out.println("Sua compra foi aprovada");
                saldoRefeicao = saldoRefeicao - valorGastorefeicao;
            } else if (valorGastorefeicao > saldoRefeicao) {
                System.out.println("Sua compra foi negada, pois falta saldo");
            }
        }

        if (operacao == 3) {
            System.out.println("Digite o valor da compra no cartão transporte: ");
            valorGastoTransporte = scanner.nextDouble();
            if (valorGastoTransporte <= saldoRefeicao) {
                System.out.println("Sua compra foi aprovada");
                saldoTransporte = saldoTransporte - valorGastoTransporte;
            } else if (valorGastorefeicao > saldoRefeicao) {
                System.out.println("Sua compra foi negada, pois falta saldo");

                System.out.println("Seu saldo do cartao alimentação é = " + saldoAlimentacao);

                System.out.println("Seu saldo do cartao refeição é = " + saldoRefeicao);

                System.out.println(" Seu saldo do cartão transporte é  " + saldoTransporte);

            }


        }
    }
}






























