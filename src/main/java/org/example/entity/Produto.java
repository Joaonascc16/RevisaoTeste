package org.example.entity;


public class Produto {

    // Atributos: características de um Produto
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor: define como um Produto "nasce"
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método: um comportamento do Produto
    public boolean estaDisponivel() {

        return this.quantidadeEmEstoque > 0;
    }
    // Exemplo de encapsulamento "de verdade": o set valida a regra de negócio
    public void setPreco(double novoPreco) {
        // Uma classe bem encapsulada não deixa o objeto entrar em um estado inválido
        if (novoPreco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = novoPreco;
    }

    // Getters: forma controlada de "ler" os atributos de fora da classe
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}