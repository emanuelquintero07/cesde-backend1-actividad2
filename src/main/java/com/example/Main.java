package com.example;

public class Main {

    public static void main(String[] args) {

        // 📘 Prueba Libro
        Libro l1 = new Libro();
        l1.mostrarDetalles();

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        System.out.println("--------------------");

        // 💳 Prueba CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.retirar(1000);

        System.out.println("--------------------");

        // 🎓 Prueba Estudiante
        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        e.mostrarInfo();
    }
}