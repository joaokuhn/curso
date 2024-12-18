package entities;

public class Idade {

    public int ano;
    public int mes;
    public int dia;

    public int calculaIdade(){
        return ((ano * 365) + (mes * 30) + dia);
    }


}