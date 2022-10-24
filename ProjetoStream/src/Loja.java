import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "Computador", 1500));
        lista.add(new Produto(2, "Mouse", 30));
        lista.add(new Produto(3, "Teclado", 80));
        lista.add(new Produto(4, "Monitor", 450));
        lista.add(new Produto(5, "Impressora", 600));
        lista.add(new Produto(6, "Notebook", 2500));

        lista.stream().forEach((p) -> {
            System.out.println(p);
        });

        System.out.println("\nProdutos em ordem alfabética...");
        lista.stream().sorted(Comparator.comparing(p -> p.getNome()))
                .forEach(p -> System.out.println(p));

        System.out.println("\nProdutos em ordem de preço...");
        lista.stream().sorted(Comparator.comparing(p -> p.getPreco()))
                .forEach(p -> System.out.println(p));

        System.out.println("\nObtendo o produto mais caro");
        Produto produtoMaisCaro;
        produtoMaisCaro = lista.stream().max(Comparator.comparing(p -> p.getPreco()))
                .orElse(null);
        if(produtoMaisCaro != null){
            System.out.println("Produto mais caro = " + produtoMaisCaro);
        }

        System.out.println("\nObtendo o produto mais barato");
        Produto produtoMaisBarato;
        produtoMaisBarato = lista.stream().min(Comparator.comparing(p -> p.getPreco()))
                .orElse(null);
        if(produtoMaisBarato != null){
            System.out.println("Produto mais barato = " + produtoMaisBarato);
        }
    }
}
