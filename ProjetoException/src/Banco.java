public class Banco {

    public void saque(double valor, Conta conta) throws SaqueInsuficienteException {
        if(conta.getSaldo() >= valor){
            conta.setSaldo(conta.getSaldo() - valor);
        }
        else{
            throw new SaqueInsuficienteException();
        }
    }
}
