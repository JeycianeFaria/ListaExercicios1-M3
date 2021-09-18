package br.com.zup;


public class Main {

    public static void main(String[] args) {

        // =============Exercicio 1==============

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



        // =============Exercicio 2==============

        //instanciando os objetos
        Pessoa pessoa1 = new Pessoa("Jeyciane", 26, 1.62);
        Pessoa pessoa2 = new Pessoa("Thaísa", 25, 1.70);

        //atribuindo valor ao atributo peso do objeto pessoa1
        pessoa1.peso = 55;


        //imprimindo valores
        System.out.println("\n===Pessoa 1===\n");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.printf("Altura: %.2f%n", pessoa1.altura);
        System.out.println("Peso: " + pessoa1.peso);
        System.out.println("\n===Pessoa 2===\n");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.printf("Altura: %.2f%n", pessoa2.altura);
        System.out.println("Peso: " + pessoa2.peso);



        // =============Exercicio 3==============

        //instanciando objetos
        ContaCorrente conta1 = new ContaCorrente("Joao", 985641);
        ContaCorrente conta2 = new ContaCorrente("Pedro", 451278);
        ContaCorrente conta3 = new ContaCorrente("Amanda", 564823);

        //atribuindo valor ao atributo saldoConta
        conta1.saldoConta = 1450;
        conta3.saldoConta = 5890;

        //imprimindo objetos
        System.out.println("\n===Conta 1===\n");
        System.out.println("Correntista: " + conta1.nomeDoCorrentista);
        System.out.println("Conta: " + conta1.numeroConta);
        System.out.println("Saldo: " + conta1.saldoConta);
        System.out.println("\n===Conta 2===\n");
        System.out.println("Correntista: " + conta2.nomeDoCorrentista);
        System.out.println("Conta: " + conta2.numeroConta);
        System.out.println("Saldo: " + conta2.saldoConta);
        System.out.println("\n===Conta 3===\n");
        System.out.println("Correntista: " + conta3.nomeDoCorrentista);
        System.out.println("Conta: " + conta3.numeroConta);
        System.out.println("Saldo: " + conta3.saldoConta);

        // ======================================

    }

}
