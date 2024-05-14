package org.example;

public class Produto {

    // atributos
    public String nome;
    public double preco;
    public Data dataValidade;

    // construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                '}';
    }
    // método para verificar a validade do produto
    public boolean estaVencido(Data dataAtual) {
        if (dataAtual.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() > dataValidade.getMes()) {
            return true;
        } else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() == dataValidade.getMes() && dataAtual.getDia() > dataValidade.getDia()) {
            return true;
        }
        return false;
    }

}
