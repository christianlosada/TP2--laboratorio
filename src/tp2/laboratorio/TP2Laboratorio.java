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
public class TP2Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj r = new Reloj(4, 444);
       Persona p = new Persona("Maxi", "Macia",1.85,36,r );
    Scanner leer=new Scanner(System.in);
        System.out.println("hola "+ p.getNombre()  );
        p.usarReloj();

        System.out.println("messi");
        System.out.flush();

}
}
