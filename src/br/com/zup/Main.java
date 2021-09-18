package br.com.zup;


public class Main {

    public static void main(String[] args) {

        //instanciando objetos bola
        Bola bolaFutsal = new Bola();
        Bola bolaBasquete = new Bola();


        //Atribindo valores a cada atríbuto dos Objetos
        bolaFutsal.circunferencia = 61;
        bolaFutsal.cor = "Branca e Azul";
        bolaFutsal.marca = "Penalty";
        bolaFutsal.velocidade = 100;


        bolaBasquete.circunferencia = 75;
        bolaBasquete.cor = "Laranja";
        bolaBasquete.marca = "Wilson NCAA";
        bolaBasquete.velocidade = 50;

        //Imprimindo objetos
        System.out.println("\n===Bola de Futsal===\n");
        System.out.println("Circunferência: " + bolaFutsal.circunferencia);
        System.out.println("Cor: " + bolaFutsal.cor);
        System.out.println("Marca: " + bolaFutsal.marca);
        System.out.println("Velocidade: " + bolaFutsal.velocidade);
        System.out.println("\n===Bola de Basquette===\n");
        System.out.println("Circunferência: " + bolaBasquete.circunferencia);
        System.out.println("Cor: " + bolaBasquete.cor);
        System.out.println("Marca: " + bolaBasquete.marca);
        System.out.println("Velocidade: " + bolaBasquete.velocidade);

    }

}
