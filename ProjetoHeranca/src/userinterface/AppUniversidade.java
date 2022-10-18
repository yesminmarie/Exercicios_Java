package userinterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Maria", "maria@email.com", "123456789");
//        p.setNome("Maria");
//        p.setEmail("maria@email.com");
//        p.setTelefone("123456789");

        System.out.println(p.exibirInfo());

        Estudante e = new Estudante("Ana", "ana@email.com", "987654321", 123, "Java");
//        e.setNome("Ana");;
//        e.setEmail("ana@email.com");
//        e.setTelefone("987654321");
//        e.setNumeroMatricula(123);
//        e.setCurso("Java");

        System.out.println(e.exibirInfo());
    }
}
