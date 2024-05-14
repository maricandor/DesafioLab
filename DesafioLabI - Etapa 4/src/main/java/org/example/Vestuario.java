package org.example;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int tamanhoMaximoEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoMaximoEstoque);
        this.produtosImportados = produtosImportados;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Getter e Setter para produtosImportados
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Vestuario{" +
                "nome='" + getNome() + '\'' +
                ", quantidadeFuncionarios=" + getQuantidadeFuncionarios() +
                ", salarioBaseFuncionario=" + getSalarioBaseFuncionario() +
                ", endereco=" + getEndereco() +
                ", dataFundacao=" + getDataFundacao() +
                ", produtosImportados=" + produtosImportados +
                '}';
    }
}
