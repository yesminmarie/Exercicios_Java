import java.util.Scanner;

public class DiversasLeituras {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double preco;
        String nome;
        String texto;

        System.out.print("Digite o codigo: ");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);

        System.out.print("Digite o nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite o preco: ");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto);

        System.out.println("Voce digitou: " + codigo + " - " + nome + " R$ " + preco);
        System.out.printf("Voce digitou: %d - %s - R$ %.2f\n", codigo, nome, preco);
    }
}