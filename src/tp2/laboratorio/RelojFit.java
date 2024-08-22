/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.laboratorio;

/**
 *
 * @author zalaz
 */
public class RelojFit extends Reloj {

    private int frecuencia;
    private int x;
    private int y;

    public RelojFit(int x, int y, int numSerie, int modelo) {
        super(numSerie, modelo);
        this.x = 0;
        this.y = 0;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int contarPasos(int x, int y) {
        if (x < 0) {
            x *= (-1);
        }
        if (y < 0) {
            y *= (-1);
        }
        return x + y;
    }

    public void frecuenciaAleatoria() {
        double a = Math.random() * 100;
        this.frecuencia = (int) a;
    }

    @Override
    public void menu() {
        boolean bandera = false;
        int pasos=0;
        mostrarPantalla();
        do {
            System.out.println("Seleccione la opcion");
            System.out.println("1-Incrementar Dia");
            System.out.println("2-Incrementar Hora");
            System.out.println("3-Incrementar Limpiar Pantalla");
            System.out.println("4-Contar Pasos");
            System.out.println("5-Mostrar Frecuencia");
            int res = leer.nextInt();
            int a;
            int b;
            switch (res) {
                case 1:
                    System.out.println("Cuenatos dias desea incrementar?");
                    a = leer.nextInt();
                    incrementarDora(a);
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
                case 4:
                    System.out.println("Ingrese las cordenadas");
                    System.out.println("Para x");
                    a = leer.nextInt();
                    System.out.println("Para y");
                    b = leer.nextInt();
                    pasos+=contarPasos(a, b);
                    System.out.println("Cantidad de pasos " + pasos);

                    break;
                case 5:
                    frecuenciaAleatoria();
                    System.out.println("La frecuencia es "+this.frecuencia);
                    break;
                default:

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
