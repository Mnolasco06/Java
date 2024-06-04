package SimulacaoBancaria;

import java.util.Scanner;

public class OperacoesBancarias {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    boolean continuar = true;


    while (continuar) {

        System.out.println("Escolha uma opção:");
        System.out.println("1: Depositar");
        System.out.println("2: Sacar");
        System.out.println("3: Consultar Saldo");
        System.out.println("4: Encerrar");
        int opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("Por favor, digite o valor a ser depositado.");
                double depositar = scanner.nextDouble();
                if (depositar > 0) {
                    saldo += depositar;
                    System.out.println("Saldo atual: " + saldo);
                } else {
                    System.out.println("Valor de depósito inválido.");
                }
                // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                break;
            case 2:
                System.out.println("Por favor, digite o valor do saque.");
                double sacar = scanner.nextDouble();
                if (sacar > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= sacar;
                    System.out.println("O seu saldo atual é: "+saldo);
                }
                // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                break;
            case 3:
                System.out.println("O seu saldo atual é: "+saldo);
                // TODO: Exibir o saldo atual da conta.
                break;
            case 0:
                System.out.println("Programa encerrado.");
                continuar = false;  // Atualiza a variável de controle para encerrar o loop
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    }

}
