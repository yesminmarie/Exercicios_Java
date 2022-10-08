// Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salario minimo,
// faça um algoritmo que receba o valor do salario minimo e a quantidade de
// kw gasta por uma residencia e calcule:
// a) o valor em reais de cada kw.
// b) o valor em reais a ser pago.
// c) o novo valor a ser pago por essa residencia com um desconto de 10%

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo;
        double quantidadeKwGasta;
        double valorCadaKw;
        double valorTotal;
        double valorTotalComDesconto;

        System.out.println("Digite o valor do salario minimo: ");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Digite a quantidade de kw gasta: ");
        quantidadeKwGasta = teclado.nextDouble();

        valorCadaKw = salarioMinimo / 7 / 100;
        valorTotal = valorCadaKw * quantidadeKwGasta;
        valorTotalComDesconto = valorTotal * 0.9;

        System.out.printf("O valor em reais de cada kw e: R$ %.2f\n", valorCadaKw);
        System.out.printf("O valor em reais a ser pago e: R$ %.2f\n", valorTotal);
        System.out.printf("O novo valor a ser pago por essa residencia com desconto de 10 por cento e: R$ %.2f\n", valorTotalComDesconto);

        teclado.close();
    }
}