/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    
package com.mycompany.gestionestudiantes;

public class Estudiante {
    private final String nombre;
    private final String matricula;
    private final int edad;
    
    public Estudiante(String nombre, String matricula, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Edad: " + edad + " años");
        System.out.println("--------------------");
    }
}
    
