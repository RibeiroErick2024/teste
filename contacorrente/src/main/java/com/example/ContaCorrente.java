package com.example;

public class ContaCorrente {
    private double saldo;
    private String nome;

    
    public ContaCorrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    
    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false; 
        } else {
            saldo -= valor;
            return true; 
        }
    }
}
