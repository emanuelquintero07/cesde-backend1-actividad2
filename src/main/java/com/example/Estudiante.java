package com.example;

public class Estudiante {

    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // usamos el setter para validar
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor a 0.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método lógico
    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    // Método mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (haAprobado() ? "APROBADO" : "REPROBADO"));
    }
}