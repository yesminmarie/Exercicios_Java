import java.util.Scanner;

//Calcular a area do triangulo (A= base * altura / 2)
public class Exercicio04 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        float base;
        float altura;
        float area;

        System.out.println("Digite o valor da base: ");
        base = teclado.nextFloat();
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextFloat();
        area = base * altura / 2;

        System.out.printf("A area do triangulo eh %.2f: ", area);

        teclado.close();
    }
}