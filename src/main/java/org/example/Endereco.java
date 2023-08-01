package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Endereco {

    private String rua;
    private int numero;

    List<Endereco> enderecos = new ArrayList<>();


    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {

    }



    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void novoEndereco(String nome){
        int qtdeEndereco;
        Scanner s = new Scanner(System.in);


        System.out.println("Quandos endereços o " + nome + " tem?");
        qtdeEndereco = s.nextInt();

        for (int x=0; x < qtdeEndereco; x++) {


            String rua;
            int numero;


            System.out.println("Digite o rua do " + nome);
            rua = s.next();
            System.out.println("Digite o numero do " + nome);
            numero = s.nextInt();

            enderecos.add(new Endereco(rua, numero));

        }
    }


    public void imprimeEnderecos(int i){




    }
}
