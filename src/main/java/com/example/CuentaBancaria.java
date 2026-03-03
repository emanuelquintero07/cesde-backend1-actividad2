package com.example;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor con validación
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // Getter y Setter del titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // SOLO Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad a depositar debe ser mayor a 0.");
        }
    }

    // Método retirar
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser mayor a 0.");
        } else if (cantidad > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            saldo -= cantidad;
        }
    }
}