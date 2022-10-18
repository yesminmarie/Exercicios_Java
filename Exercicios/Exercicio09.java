import java.util.Scanner;

//Calcular o volume de um ciclindro, dado seu diametro e considerando pi=3,14
// V = 3,14 * raio * raio * altura
public class Exercicio09 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double raio;
        double altura;
        double volume;

        System.out.println("Digite o valor do diametro: ");
        raio = teclado.nextFloat();
        System.out.println("Digite o valor da altura: ");
        altura = teclado.nextFloat();
        volume = 3.14 * raio * raio * altura;

        System.out.printf("O volume do cilindro e %.3f cm3\n ", volume);

        teclado.close();
    }
}