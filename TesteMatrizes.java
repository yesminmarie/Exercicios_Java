import java.util.Scanner;
public class TesteMatrizes{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double matriz[][];

        matriz = new double[3][5];

        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                System.out.print("Digite o valor da matriz [" + linha + "][" + coluna + "] - ");
                matriz[linha][coluna] = teclado.nextDouble();
            }
        }

        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                System.out.printf("%10.2f", matriz[linha][coluna]);
            }
            System.out.println();
        }

        teclado.close();
    }
}