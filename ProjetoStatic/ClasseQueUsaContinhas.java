public class ClasseQueUsaContinhas {
    public static void main(String[] args) {

        int s = Utilitarios.soma(4, 6);
        int p = Utilitarios.potencia(3, 4);

        System.out.println("Resultado da soma = " + s);
        System.out.println("Resultado da potencia = " + p);
        System.out.println("Valor do PI = " + Utilitarios.PI);

        //Utilitarios.PI = 3.1215; //erro, pois o atributo é final
    }
}
