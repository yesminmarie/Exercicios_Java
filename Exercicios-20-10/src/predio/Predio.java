package predio;

public class Predio {
    private String endereco;
    private String cidade;
    private String estado;
    private int numApartamento;

    public Predio(){

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumApartamento() {
        return numApartamento;
    }

    @Override
    public String toString() {
        return "Predio{" +
                "endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", numApartamento=" + numApartamento +
                '}';
    }

    public void setNumApartamento(int numApartamento) {
        if(numApartamento > 0){
            this.numApartamento = numApartamento;
        } else {
            System.out.println("Número de apartamento inválido");
        }

    }

    public static void main(String[] args) {
        Predio predio = new Predio();
        predio.setCidade("São Paulo");
        predio.setEndereco("Av Paulista");
        predio.setEstado("SP");
        predio.setNumApartamento(5);

        Predio predio2 = new Predio();
        predio2.setCidade("Rio de Janeiro");
        predio2.setEstado("RJ");
        predio2.setEndereco("Copacabana");
        predio2.setNumApartamento(0);

        System.out.println("Predio1: " + predio);
        System.out.println("Predio2: " + predio2);
    }
}
