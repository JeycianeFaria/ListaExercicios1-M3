package br.com.zup;

public class Pais {

    String nomePais;
    double extensãoTerritorial;
    double tamanhoPopulação;

    public Pais(String nomePais, double tamanhoPopulação, double extensãoTerritorial){

        this.nomePais = nomePais;
        this.tamanhoPopulação = tamanhoPopulação;
        this.extensãoTerritorial = extensãoTerritorial;

    }

    public  double densidade(){
        return tamanhoPopulação/extensãoTerritorial;
    }



}
