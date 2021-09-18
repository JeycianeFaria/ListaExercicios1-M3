package br.com.zup;

public class Carro {

    double potencia = 2.0;
    int qtdPortas;
    String modelo;
    String marca;

    //metodo construtor
    public  Carro(String modelo, String marca, int qtdPortas){

        this.modelo = modelo;
        this.marca = marca;
        this.qtdPortas = qtdPortas;

    }

}
