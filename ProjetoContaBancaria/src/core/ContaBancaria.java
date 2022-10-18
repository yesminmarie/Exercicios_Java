package core;

public class ContaBancaria {
    private int numeroConta;
    private int digitoVerificador;
    private String nomeTitular;
    private String cpfTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, int digitoVerificador, String nomeTitular, String cpfTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.digitoVerificador = digitoVerificador;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(getSaldo() < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }

    public String exibirDadosDaConta(){
        return "Numero da conta: " + numeroConta +
                "\nDigito verificador: " + digitoVerificador +
                "\nTitular: " + nomeTitular +
                "\nCPF: " + cpfTitular +
                String.format("\nSaldo: %.2f", saldo);
    }
}
