package app;

import core.ContaBancaria;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(
                123456, 7, "Maria", "12345678901", 0 );
        Scanner teclado = new Scanner(System.in);

        int opcao;
        double valor;

        do {
            System.out.println(
                    "Digite 1 para saque. " +
                            "\nDigite 2 para depósito. " +
                            "\nDigite 3 para exibir dados da conta bancária. " +
                            "\nDigite 0 para sair");
            opcao = teclado.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = teclado.nextDouble();
                    if(contaBancaria.sacar(valor)){
                        System.out.println("Saque realizado com sucesso!!!");
                    } else {
                        System.out.println("Voce nao possui saldo suficiente. Seu saldo é: " + contaBancaria.getSaldo() );
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    valor = teclado.nextDouble();
                    contaBancaria.depositar(valor);
                    System.out.println("Depósito realizado com sucesso");
                    break;

                case 3:
                    System.out.println("Dados da conta bancária:");
                    System.out.println(contaBancaria.exibirDadosDaConta());
                    break;
                case 0:
                    System.out.println("Obrigado pela preferência. Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while(opcao != 0);

        teclado.close();

    }


}
