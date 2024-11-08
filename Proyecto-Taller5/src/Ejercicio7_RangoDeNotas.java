/*Rango de Notas: Asignar una letra (A, B, C, D) 
a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
@author Jorge Guerrero
*/

import java.util.Scanner;

public class Ejercicio7_RangoDeNotas {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la calificacion (0-100): ");
        int calificacion = tcl.nextInt();
        String letra;

        if (calificacion >= 90 && calificacion <= 100) {
            letra = "A";
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = "B";
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = "C";
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = "D";
        } else if (calificacion >= 0 && calificacion < 60) {
            letra = "F";
        } else {
            letra = "Calificacion no valida";
        }

        System.out.println("La calificacion es: " + letra);

    }

}


