import java.util.Scanner;
public class TesteVetor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valores[];

        valores = new double[10];

        System.out.println("Digite valores");
        for(int pos = 0; pos < valores.length; pos++){
            valores[pos] = teclado.nextDouble();
        }

        System.out.println("Valores digitados:");
        for(int pos = 0; pos < valores.length; pos++){
            System.out.printf("%.1f ", valores[pos]);
        }

        teclado.close();
    }
}