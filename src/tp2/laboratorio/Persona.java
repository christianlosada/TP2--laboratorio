/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.laboratorio;

import java.util.Scanner;

/**
 *
 * @author Netbook
 */
public class Persona {
    private String nombre;
    private String apellido;
    private double altura;
    private int edad;
    private Reloj reloj;

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    public void usarReloj(){
        System.out.println("la hora es: " + reloj.getHora());
        System.out.println("la dia es: " + reloj.getDia());
        System.out.println("vamos a incrementar 1 dia");
        reloj.incrementarDora(1);
        reloj.incrementarHora(0, 1);
        
    }

    public Persona(String nombre, String apellido, double altura, int edad, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.edad = edad;
        this.reloj = reloj;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    

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
        this.edad = edad;
    }
    
}
