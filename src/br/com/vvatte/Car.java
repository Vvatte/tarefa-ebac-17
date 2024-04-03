package br.com.vvatte;

public abstract class Car {

    private String modelo;
    private String cor;
    private Integer ano;

    public Car(String modelo, String cor, Integer ano){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Marca: " + getClass().getSimpleName() +
                ", Modelo= " + modelo +
                ", Cor= " + cor  +
                ", Ano= " + ano ;
    }
}
