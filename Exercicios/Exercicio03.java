import java.util.Scanner;

//Calcular area do retangulo
public class Exercicio03 {
    public static void main (String args[]){
        int lado1;
        int lado2;
        int area;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = teclado.nextInt();

        System.out.println("Digite o valor do segundo lado: ");
        lado2 = teclado.nextInt();

        area = lado1 * lado2;

        System.out.println("A area do retangulo eh: " + area);

        teclado.close();
    }
}