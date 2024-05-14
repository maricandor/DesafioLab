package org.example;

import java.util.Scanner;

public class AnoBissexto {

    // classe para verificar se o ano é bissexto com scan
    private int ano;
    public AnoBissexto(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano para verificar se é bissexto:");
        int ano = scanner.nextInt();
        AnoBissexto anoBissexto = new AnoBissexto(ano);
        boolean resultado = anoBissexto.verificaAnoBissexto();
        if (resultado) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        scanner.close();
    }
}

