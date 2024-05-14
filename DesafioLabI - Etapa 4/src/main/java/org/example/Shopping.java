package org.example;

import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                if (tipoLoja.equalsIgnoreCase("Cosmetico") && loja instanceof Cosmetico) {
                    count++;
                } else if (tipoLoja.equalsIgnoreCase("Vestuario") && loja instanceof Vestuario) {
                    count++;
                } else if (tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
                    count++;
                } else if (tipoLoja.equalsIgnoreCase("Alimentacao") && loja instanceof Alimentacao) {
                    count++;
                } else if (tipoLoja.equalsIgnoreCase("Informática") && loja instanceof Informatica) {
                    count++;
                }
            }
        }
        if (count == 0 && !(tipoLoja.equalsIgnoreCase("Cosmetico") || tipoLoja.equalsIgnoreCase("Vestuario") || tipoLoja.equalsIgnoreCase("Bijuteria") || tipoLoja.equalsIgnoreCase("Alimentacao") || tipoLoja.equalsIgnoreCase("Informatica"))) {
            return -1;
        }
        return count;
    }
    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCaro = null;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (maisCaro == null || informatica.getSeguroEletronicos() > maisCaro.getSeguroEletronicos()) {
                    maisCaro = informatica;
                }
            }
        }
        return maisCaro;
    }
}
