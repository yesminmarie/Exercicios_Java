import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<PessoaColaboradora> pessoas = new ArrayList<>();
        pessoas.add(new PessoaColaboradora("Ana", 3000, 32));
        pessoas.add(new PessoaColaboradora("Maria", 4000, 30));
        pessoas.add(new PessoaColaboradora("Pedro", 2000, 25));
        pessoas.add(new PessoaColaboradora("João", 1500, 45));

        // aplica aumento de 15% no salário para todas as pessoas
        ArrayList<PessoaColaboradora> lista = (ArrayList<PessoaColaboradora>) pessoas.stream()
                .map(pessoa -> {
                    pessoa.setSalario((pessoa.getSalario() + pessoa.getSalario() * 0.15f));
                    return pessoa;
                }).collect(Collectors.toList());

        lista.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getSalario()));

        // aplica aumento de 20% para pessoas acima de 30 anos
        ArrayList<PessoaColaboradora> novaLista = (ArrayList<PessoaColaboradora>) pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() > 30)
                .map(pessoa -> {
                    pessoa.setSalario(pessoa.getSalario() + pessoa.getSalario()*0.2f);
                    return pessoa;
                })
                .collect(Collectors.toList());

        System.out.println("===============");
        novaLista.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getSalario()));

    }
}
