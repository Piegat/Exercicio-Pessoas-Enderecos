package org.example;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;

    private List<Pessoa> pessoas = new ArrayList<>();

    private List<Endereco> enderecos = new ArrayList<>();

    public Pessoa(String nome, int idade, List<Endereco> enderecos) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = enderecos;
    }

    public Pessoa(){

    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }


    public String getNome() {
        return nome;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void novaPessoa(){

        Endereco endereco = new Endereco();

        Scanner s = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite o nome:");
        nome = s.next();
        System.out.println("Digite a idade:");
        idade = s.nextInt();


        endereco.novoEndereco(nome);

        pessoas.add(new Pessoa(nome, idade, endereco.enderecos));


    }

    public void listaPessoas(){

        for (Pessoa pessoa:
                pessoas) {
            System.out.println("==================");

            System.out.println("Nome: "+ pessoa.getNome() + "\n Idade: " + pessoa.getIdade());

            for (int i=0; i < pessoa.getEnderecos().size(); i++){

                System.out.println("Endereços\n Rua: " + pessoa.getEnderecos().get(i).getRua() + " Número: " + pessoa.getEnderecos().get(i).getNumero());
            }


            System.out.println("==================");
        }
    }

    public void buscarPessoa(){
        Scanner s = new Scanner(System.in);
        String nome;

        System.out.println("===========================");
        System.out.println("Digite o nome do cliente: ");
        nome = s.next();

        Pessoa pessoaEncontrada = findPessoa(nome);

        if(pessoaEncontrada != null){

            displayPessoa(pessoaEncontrada);

        }else {
            System.out.println("Pessoa não encontrada");
        }


    }

    public Pessoa findPessoa(String nome) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    private void displayPessoa(Pessoa pessoa) {
        System.out.println("======== Cliente Encontrado ========");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("======== Endereços ========");
        for (Endereco endereco : pessoa.getEnderecos()) {
            System.out.println("===============================");
            System.out.println("Rua: " + endereco.getRua());
            System.out.println("Número: " + endereco.getNumero());
        }
    }


}
