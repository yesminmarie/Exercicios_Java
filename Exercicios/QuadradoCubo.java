// Escreva um programa que leia um valor inteiro N(1 < N < 1000).
// Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa

import java.util.Scanner;

public class QuadradoCubo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        for(int contador = 1; contador <= numero; contador++){

            if(numero <= 1 || numero >= 1000 ){
                break;
            }
            System.out.println(contador + " " + contador*contador + " " + contador*contador*contador);
        }

        teclado.close();
    }
}