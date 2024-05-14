package org.example;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int tamanhoMaximoEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoMaximoEstoque);
        this.dataAlvara = dataAlvara;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", dataAlvara=" + dataAlvara +
                '}';
    }
}
