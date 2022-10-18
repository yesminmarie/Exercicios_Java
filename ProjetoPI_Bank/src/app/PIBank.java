package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana", "123.456.789-01", 123, 100.0);
        Conta contaEspecial = new ContaEspecial("Maria", "789.456.123-14", 456, 100.0, 100);

        System.out.println(conta);
        System.out.println(contaEspecial);

        conta.debitar(80);
        contaEspecial.debitar(180);

        System.out.println(conta);
        System.out.println(contaEspecial);
    }
}
