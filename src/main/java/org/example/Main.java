package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        List<String> nomes = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int escolha;

//        for(int i=0; i < 3; i++) {
//
//            System.out.println("Digite o nome:");
//            nomes.add(s.next());
//
//            System.out.println(nomes.get(i));
//
//        }
//        System.out.println(nomes.size());


        List<Pessoa> pessoas = new ArrayList<>();

        do {
            Main.imprimeMenu();
            escolha = s.nextInt();

            switch (escolha) {

                case 1 -> pessoa.novaPessoa();
                case 2 -> pessoa.listaPessoas();
                case 3 -> pessoa.buscarPessoa();
                case 0 -> {
                    System.out.println("Saindo...");
                    return;
                }

                default -> System.out.println("Opção invalida!");



            }
        }while (true);
    }

    public static void imprimeMenu(){

        System.out.println("=====================");
        System.out.println("1. Cadastrar Pessoa");
        System.out.println("2. Listar Pessoas");
        System.out.println("3. Buscar Pessoa");
        System.out.println("0. Sair");
        System.out.println("=====================");
        System.out.print("Digite a opção desejada: ");


    }



}