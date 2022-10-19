public class BDAccess implements InterfaceBD{
    @Override
    public void conectar() {
        System.out.println("Conectando no banco ACCESS");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco ACCESS");
    }

    @Override
    public void executar(String comando) {
        System.out.println("ms-access> " + comando);
    }
}
