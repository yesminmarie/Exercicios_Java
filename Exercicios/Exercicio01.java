import java.util.Scanner;

//Inserir um numero e inverte-lo. Ex.: 123, deve ficar 321
public class Exercicio01 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal;
        int centena;
        int dezena;
        int unidade;
        int resto;
        int novoNumero;

        // ENTRADA DE DADOS
        System.out.println("Insira um numero inteiro de 3 digitos");
        numeroOriginal = teclado.nextInt();

        // PROCESSAMENTO
        // Exemplo: 123
        centena = numeroOriginal / 100; // 100
        resto = numeroOriginal % 100; // 23
        dezena = resto / 10; // 20
        unidade = resto % 10; // 3

        // SAIDA
        novoNumero = unidade * 100 + dezena * 10 + centena;
        System.out.println("O numero invertido eh: " + novoNumero);

        teclado.close();

    }
}