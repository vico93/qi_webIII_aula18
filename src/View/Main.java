package View;

import Model.Idade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada
        Scanner stdin = new Scanner(System.in);

        Idade i1 = new Idade(20);

        byte opcao;

        System.out.println("AULA 18");
        do {
            System.out.println("1- Cadastre as idades;\n" +
                    "2- Veja as idades cadastradas;\n" +
                    "3- Veja a média de idade;\n" +
                    "4- Veja a maior idade;\n" +
                    "5- Conte quantos são maiores de idade;\n" +
                    "0- Sair");

            opcao = stdin.nextByte();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando...");
                    for (int i=0; i < i1.getIdades().length; i++) {
                        System.out.println("Digite a " + (i+1) + "ª idade: ");
                        int idade = stdin.nextInt();
                        i1.cadastrarIdade(i, idade);
                    }
                    System.out.println("Idades cadastradas!");
                    break;
                case 2:
                    System.out.println(i1);
                    break;
                case 3:
                    System.out.println("Média de idade: " + i1.calcularMediaIdades());
                    break;
                case 4:
                    System.out.println("Maior idade: " + i1.maiorIdade());
                    break;
                case 5:
                    System.out.println("Tem " + i1.contarMaioresIdade() + " maiores de idade!");
                    break;
                case 0:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente novamente!");
            }
        }
        while (opcao != 0);
    }
}
