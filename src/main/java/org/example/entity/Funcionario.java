package org.example.entity;

public class Funcionario {

    private String nome;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.ativo = true;
    }

    public void demitir() {
        if (!this.ativo) {
            throw new IllegalStateException("Funcionário já está demitido.");
        }
        this.ativo = false;
    }

    public void aumentarSalario(double percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException("O percentual deve ser maior que zero.");
        }
        this.salario += this.salario * (percentual / 100);
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }
    public boolean isAtivo() { return ativo; }
}