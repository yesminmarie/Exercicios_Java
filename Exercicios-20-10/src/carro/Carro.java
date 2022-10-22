package carro;

public class Carro {
    private int numPortas;
    private int ano;
    private float preco;
    private float kilometragem;
    private String marca;
    private String cor;

    public Carro(){

    }

    public Carro(String marca, String cor){
        this.marca = marca;
        this.cor = cor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(float kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setAno(2020);
        c1.setCor("Branco");
        c1.setKilometragem(50000);
        c1.setMarca("Ford");
        c1.setNumPortas(4);

        Carro c2 = new Carro("WV", "Preto");
        c2.setNumPortas(4);
        c2.setPreco(60000);
        c2.setAno(2019);
        c2.setKilometragem(60000);
    }
}
