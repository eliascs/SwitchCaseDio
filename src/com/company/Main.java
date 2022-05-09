package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner String;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String dia;

        System.out.println("Digite um dia da Semana" );
        dia = ler.next();

        switch (dia) {

            case "segunda":
                System.out.println("Hoje voce precisa estudar Inglês");
                break;

            case "terça":
                System.out.println("Hoje voce precisa estudar matematica" );
                break;

            case "Quarta":
                System.out.println("Hoje voce precisa estudar História" );
                break;

            case "Quinta":
                System.out.println("Hoje voce precisa estudar Java" );
                break;

            case "Sexta":
                System.out.println("Hoje voce precisa estudar Musica" );
                break;

            case "Sabado":
                System.out.println("Hoje voce precisa estudar Algoritmos" );
                break;

            case "Domingo":
                System.out.println("Hoje voce precisa estudar Musica" );
                break;

        }
    }
}





