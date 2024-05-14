package org.example;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        int opcao;
        do {
            System.out.println("MENU:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome da loja:");
                    String nomeLoja = scan.nextLine();
                    System.out.println("Informe a quantidade de funcionários:");
                    int quantidadeFunc = scan.nextInt();

                    System.out.println("Informe a rua da loja:");
                    String ruaLoja = scan.nextLine();
                    System.out.println("Informe o número da loja:");
                    String numeroLoja = scan.nextLine();
                    System.out.println("Informe a cidade da loja:");
                    String cidadeLoja = scan.nextLine();

                    Endereco enderecoLoja = new Endereco(ruaLoja, numeroLoja, cidadeLoja);

                    System.out.println("Informe o dia de fundação da loja:");
                    int diaFund = scan.nextInt();
                    System.out.println("Informe o mês de fundação da loja:");
                    int mesFund = scan.nextInt();
                    System.out.println("Informe o ano de fundação da loja:");
                    int anoFund = scan.nextInt();
                    Data dataFund = new Data(diaFund, mesFund, anoFund);

                    loja = new Loja(nomeLoja, quantidadeFunc, enderecoLoja, dataFund);
                    break;
                case 2:
                    if (loja == null) {
                        System.out.println("Você precisa criar uma loja primeiro.");
                        break;
                    }
                    System.out.println("Informe o nome do produto:");
                    scan.nextLine();
                    String nomeProduto = scan.nextLine();
                    System.out.println("Informe o preço do produto:");
                    double precoProduto = scan.nextDouble();
                    System.out.println("Informe o dia de validade do produto:");
                    int diaValidade = scan.nextInt();
                    System.out.println("Informe o mês de validade do produto:");
                    int mesValidade = scan.nextInt();
                    System.out.println("Informe o ano de validade do produto:");
                    int anoValidade = scan.nextInt();
                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                    produto = new Produto(nomeProduto, precoProduto, dataValidade);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        if (produto != null) {
            Data dataReferencia = new Data(20, 10, 2023);
            if (produto.estaVencido(dataReferencia)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
        }

        if (loja != null) {
            System.out.println("Informações da loja:");
            System.out.println(loja);
        }

        scan.close();
    }
}
