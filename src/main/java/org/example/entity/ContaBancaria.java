package org.example.entity;

// Classe de entidade: representa uma Conta Bancária simples
public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor: toda conta nasce com saldo zero
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Depositar: só aceita valores positivos
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldo += valor;
    }

    // Sacar: só permite valores positivos e que não ultrapassem o saldo
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para este saque.");
        }
        this.saldo -= valor;
    }

    // Getters — leitura controlada do estado da conta
    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Note que NÃO existe um setSaldo(): o saldo só pode mudar
    // através de depositar() e sacar(), que aplicam as regras de negócio.
}