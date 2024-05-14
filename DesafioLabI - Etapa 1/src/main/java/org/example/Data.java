package org.example;

public class Data {

    // atributos
    public int id;
    public int dia;
    public int mes;
    public int ano;

    //construtor
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Utilizando data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    //métodos

    public int getId() {
        return id;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    private boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }
    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return verificaAnoBissexto() ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
}
