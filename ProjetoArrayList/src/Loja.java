import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {
//        Produto lista[];
//        lista = new Produto[5];
//
//        lista[0] = new Produto(1, "Computdador", 1500.00);
//        lista[1] = new Produto(2, "Mouse", 30.0);
//        lista[2] = new Produto(3, "Teclado", 80.0);
//        lista[3] = new Produto(4, "Monitor", 400.0);
//        lista[4] = new Produto(5, "Impressora", 650.0);
//
//        for(int i = 0; i < lista.length; i++){
//            System.out.println(lista[i]);
//        }

        ArrayList<Produto> lista;
        lista = new ArrayList<>();

        lista.add(new Produto(1, "Computdador", 1500.00));
        lista.add(new Produto(2, "Mouse", 30.0));
        lista.add(new Produto(3, "Teclado", 80.0));
        lista.add(new Produto(4, "Monitor", 400.0));
        lista.add(new Produto(5, "Impressora", 650.0));

//        for (Produto p : lista){
//            System.out.println(p);
//        }

        lista.remove(2);

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
