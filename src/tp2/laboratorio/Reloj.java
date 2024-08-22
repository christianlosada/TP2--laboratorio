/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.laboratorio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Netbook
 */
public class Reloj {

    Scanner leer = new Scanner(System.in);
    private LocalDate dia;
    private LocalTime hora; 
    private int numSerie;
    private int modelo;

//incrementar dia , incrementar hora, limpiar pantalla
    public void limpiarPantalla() {
        this.dia = LocalDate.now();
        this.hora= LocalTime.now().withNano(0);
    }

    public void incrementarHora(int horaMas, int minutoMas) {
        int suma = horaMas * 60 + minutoMas;
        hora=hora.plusMinutes(suma);
        System.out.println("La hora es: " + hora);
    }

    public void incrementarDora(int diasMas) {
        dia=dia.plusDays(diasMas);
        System.out.println("el dia es : " + dia);
    }

    public Reloj(int numSerie, int modelo) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.dia = LocalDate.now();
        this.hora=LocalTime.now().withNano(0);
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void mostrarPantalla() {
        System.out.println(" ******** " + hora + " ***********");
        System.out.println(" ******** " + dia  + " ***********");
    }
   
    public void menu() {
        boolean bandera = false;
        mostrarPantalla();
        do {
            System.out.println("Seleccione la opcion");
            System.out.println("1-Incrementar Dia");
            System.out.println("2-Incrementar Hora");
            System.out.println("3-Incrementar Limpiar Pantalla");
            int res = leer.nextInt();
            int a;
            int b;
            LocalDate c = dia;
            double sumaDias;
            switch (res) {
                case 1:
                    System.out.println("Cuenatos dias desea incrementar?");
                    a = leer.nextInt();
                    
                    incrementarDora(a++);
                    break;
                case 2:
                    System.out.println("Cuenatas horas deseas incrementar?");
                    System.out.println("Ingrese la cantidad de horas");
                    a = leer.nextInt();
                    System.out.println("Ingrese la cantidad de minutos");
                    b = leer.nextInt();
                    incrementarHora(a, b);
                    break;
                case 3:
                    limpiarPantalla();
                    mostrarPantalla();
                    break;
                default:
                    System.out.println("");
            }
            leer.nextLine();
            System.out.println("desea continuar?");
            System.out.println("S/N");
            String salida = leer.nextLine();
            if (salida.equalsIgnoreCase("s")) {
                bandera = true;
            } else if (salida.equalsIgnoreCase("n")) {
                bandera = false;
            } else {
                System.out.println("**** ERROR");
            }
        } while (bandera);
    }
}
