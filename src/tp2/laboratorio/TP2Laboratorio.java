
package tp2.laboratorio;

import java.util.Scanner;


public class TP2Laboratorio {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Reloj r = new Reloj(4, 444);
        RelojFit FIT = new RelojFit(0, 0, 4, 444);
        
        Persona p2 = new Persona("Fabri", "Zalazar", 1.80, 23, r);
        Persona p = new Persona("Maxi", "Macia", 1.85, 36, FIT);
        
        //System.out.println("Hola " + p2.getNombre());
        //p2.usarReloj();
        System.out.println("Hola " + p.getNombre());
        p.usarReloj();
        

    }
}
