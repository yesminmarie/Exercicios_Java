public class SaqueInsuficienteException extends Exception{
    public SaqueInsuficienteException(){
        super("Saldo insuficiente para realizar o saque.");
    }
}
