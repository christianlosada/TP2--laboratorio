/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.laboratorio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Netbook
 */
public class Reloj {

    private LocalDate dia = LocalDate.now();
    private LocalTime hora= LocalTime.now().withNano(0);
    private int numSerie;
    private int modelo;

//incrementar dia , incrementar hora, limpiar pantalla
   
    public void limpiarPantalla(){
        
    System.out.flush();  

}
    

    public void incrementarHora(int horaMas, int minutoMas){
        int suma= horaMas*60+minutoMas;
        System.out.println("La hora es: " + hora.plusMinutes(suma));
    }
      public void incrementarDora(int diasMas){
       
        System.out.println("el dia es : " + dia.plusDays(diasMas));
    }
    public Reloj(int numSerie, int modelo) {
        this.numSerie = numSerie;
        this.modelo = modelo;
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

}
