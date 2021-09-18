package br.com.zup;

public class ContaCorrente {

    double saldoConta;
    int numeroConta;
    String nomeDoCorrentista;

    //metodo construtor
    public ContaCorrente(String nomeDoCorrentista, int numeroConta){

        this.nomeDoCorrentista = nomeDoCorrentista;
        this.numeroConta = numeroConta;

    }
}
