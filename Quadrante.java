// Escreva um programa para ler as cooredenadas (X,Y) de uma
// quantidade indeterminada de pontos no sistema cartesiano.
// Para cada ponto escrever o quadrante a que ele pertence.
// O algoritmo será encerrado quando pelo menos uma de duas 
// coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Quadrante {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int coordenadaX;
        int coordenadaY;
        do {
            coordenadaX = teclado.nextInt();
            coordenadaY = teclado.nextInt();

            if (coordenadaX > 0 && coordenadaY > 0){
                System.out.println("Primeiro quadrante");
            }
            else if (coordenadaX < 0 && coordenadaY > 0){
                System.out.println("Segundo quadrante");
            }
            else if (coordenadaX < 0 && coordenadaY < 0){
                System.out.println("Terceiro quadrante");
            }
            else if (coordenadaX > 0 && coordenadaY < 0) {
                System.out.println("Quarto quadrante");
            }
        } while(coordenadaX != 0 && coordenadaY != 0);

        teclado.close();
    }
}
