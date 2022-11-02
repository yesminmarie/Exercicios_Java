public class Main {
    public static void main(String[] args) {
        Banco b = new Banco();
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.setSaldo(100.50);

        try{
            b.saque(110.00, c1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Saldo conta 1: " + c1.getSaldo());
        }

        c2.setSaldo(200);
        try{
            b.saque(50, c2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Saldo conta 2: " + c2.getSaldo());
        }
    }
}
