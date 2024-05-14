package org.example;

public class Loja {

    // atributos
    public String nome;
    public int quantidadeFuncionarios;
    public double salarioBaseFuncionario;
    public Endereco endereco;
    public Data dataFundacao;

    //construtores
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
    }
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    //métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Data getDataFundacao() {
        return dataFundacao;
    }
    public void setDataFundacao(Data data) {
        this.dataFundacao = data;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao +
                '}';
    }
    public double gastosComSalario(){
    //não recebe parâmetros e retorna quanto a loja gasta com o salário de todos os seus funcionários
    // não é possível realizar este cálculo caso o valor do salário base seja -1. Neste caso, não realize o cálculo e retorne -1.

        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }
    public char tamanhoDaLoja(){
    //não recebe parâmetros e retorna um dos seguintes caracteres: ‘P’, caso a loja possua menos de 10 funcionários;
    // ‘M’, caso a loja possua entre 10 (inclusive) e 30 (inclusive) funcionários; ou
    // ‘G’, caso a loja possua mais do que 31 (inclusive) funcionários.

        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}
