import java.util.Scanner;

// Calcular area do quadrado (A = lado * lado)
public class Exercicio02 {
    public static void main (String args[]){
        int lado;
        int area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado");
        lado = teclado.nextInt();

        area = lado * lado;
        System.out.println("A area do quadrado eh: " + area);

        teclado.close();
    }
}