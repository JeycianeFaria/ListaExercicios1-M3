package br.com.zup.Exercicio1;


import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        //instanciando objetos bola
        Bola bolaFutsal = new Bola();
        Bola bolaBasquete = new Bola();


        //Atribindo valores a cada parametro dos Objetos
        bolaFutsal.circunferencia = 61;
        bolaFutsal.cor = "Branca e Azul";
        bolaFutsal.marca = "Penalty";
        bolaFutsal.velocidade = 100;


        bolaBasquete.circunferencia = 75;
        bolaBasquete.cor = "Laranja";
        bolaBasquete.marca = "Wilson NCAA";
        bolaBasquete.velocidade = 50;

    }

}
