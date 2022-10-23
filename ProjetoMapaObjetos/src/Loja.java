import java.util.HashMap;

public class Loja {
    public static void main(String[] args) {
        HashMap<Integer, Produto> mapa;
        mapa = new HashMap<>();

        mapa.put(1, new Produto(1, "Computador", 1500.0));
        mapa.put(2, new Produto(2, "Mouse", 30.0));
        mapa.put(3, new Produto(3, "Teclado", 70.0));
        mapa.put(4, new Produto(4, "Monitor", 600.0));

        int codigoABuscar = 3;

        Produto p = mapa.get(codigoABuscar);
        if(p != null) {
            System.out.println("Encontrei: " + p);
        }else {
            System.out.println("Não existe");
        }

    }
}
