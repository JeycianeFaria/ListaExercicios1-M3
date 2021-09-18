package br.com.zup;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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



        // =============Exercicio 4==============

        //instanciando objetos
        Carro carro1 = new Carro("Golf GTI", "Volkswagen", 4);
        Carro carro2 = new Carro("Uno Mille", "Fiat", 4);
        Carro carro3 = new Carro("Fusca", "Volkswagen", 2 );

        //atribuindo valor ao atributo potencia.
        carro2.potencia = 1.0;
        carro3.potencia = 1.6;

        //imprimindo objetos
        System.out.println("\n===Carro 1===\n");
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Quantidade de Portas: " + carro1.qtdPortas);
        System.out.println("Potencia: " + carro1.potencia);
        System.out.println("\n===Carro 2===\n");
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Quantidade de Portas: " + carro2.qtdPortas);
        System.out.println("Potencia: " + carro2.potencia);
        System.out.println("\n===Carro 3===\n");
        System.out.println("Modelo: " + carro3.modelo);
        System.out.println("Marca: " + carro3.marca);
        System.out.println("Quantidade de Portas: " + carro3.qtdPortas);
        System.out.println("Potencia: " + carro3.potencia);



        // =============Exercicio Level Up==============

        //criando List
        List<String> continente = new ArrayList<>();

        //intanciando os paises
        Pais pais1 = new Pais("Argentina", "44,5 milhões", "2.780.400 km²");
        Pais pais2 = new Pais("Brasil", "213 milhões", "8.514.876 km²");
        Pais pais3 = new Pais("Chile", "18 milhões", "756.945 km²");
        Pais pais4 = new Pais("Colômbia", "45,6 milhões", "1.138.914 km²");

        //adicionando os paises a lista
        continente.add("Pais: " + pais1.nomePais + " ||Tamanho Populção: " + pais1.tamanhoPopulação + " ||Extensão Territorial: " + pais1.extensãoTerritorial);
        continente.add("Pais: " + pais2.nomePais + " ||Tamanho Populção: " + pais2.tamanhoPopulação + " ||Extensão Territorial: " + pais2.extensãoTerritorial);
        continente.add("Pais: " + pais3.nomePais + " ||Tamanho Populção: " + pais3.tamanhoPopulação + " ||Extensão Territorial: " + pais3.extensãoTerritorial);
        continente.add("Pais: " + pais4.nomePais + " ||Tamanho Populção: " + pais4.tamanhoPopulação + " ||Extensão Territorial: " + pais4.extensãoTerritorial);

        //instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        boolean exibirMenu = true;
        int opçãoSelecionada = 0;

        while (exibirMenu) {

            System.out.println("\n===América do Sul===\n");
            System.out.println("1- Exibir lista de países do continente.");
            System.out.println("2- Sair.");
            System.out.println("Digite a opção desejada: ");
            opçãoSelecionada = leitor.nextInt();

            if (opçãoSelecionada == 1) {

                for (String exibirLista : continente) {
                    System.out.println(exibirLista);
                }

            } else if (opçãoSelecionada == 2) {

                exibirMenu = false;
                System.out.println("Até a proxima!");

            } else {

                System.out.println("Opção selecionda inválida!");

            }

        }

        // =============================================

    }

}
