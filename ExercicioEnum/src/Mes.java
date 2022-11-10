public class Mes {
    public static void main(String[] args) {
        MesesEnum mes = MesesEnum.OUTUBRO;

        switch (mes){
            case JANEIRO:
                System.out.println(MesesEnum.JANEIRO.getValorMes());
                break;

            case FEVEREIRO:
                System.out.println(MesesEnum.FEVEREIRO.getValorMes());
                break;

            case MARCO:
                System.out.println(MesesEnum.MARCO.getValorMes());
                break;

            case ABRIL:
                System.out.println(MesesEnum.ABRIL.getValorMes());
                break;

            case MAIO:
                System.out.println(MesesEnum.MAIO.getValorMes());
                break;

            case JUNHO:
                System.out.println(MesesEnum.JUNHO.getValorMes());
                break;

            case JULHO:
                System.out.println(MesesEnum.JULHO.getValorMes());
                break;

            case AGOSTO:
                System.out.println(MesesEnum.AGOSTO.getValorMes());
                break;

            case SETEMBRO:
                System.out.println(MesesEnum.SETEMBRO.getValorMes());
                break;

            case OUTUBRO:
                System.out.println(MesesEnum.OUTUBRO.getValorMes());
                break;

            case NOVEMBRO:
                System.out.println(MesesEnum.NOVEMBRO.getValorMes());
                break;

            case DEZEMBRO:
                System.out.println(MesesEnum.DEZEMBRO.getValorMes());
                break;
        }

        System.out.println("Todos os meses");
        for(MesesEnum meses: MesesEnum.values()){
            System.out.println(meses);
        }
    }
}
