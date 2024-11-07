
import java.util.Scanner;

/**
 * Categoría de Edad: Clasificar a una persona en una categoría de edad (niño,
 * adolescente, adulto) en función de su edad.
 *
 * @author Andrés
 */
public class Ejercicio6_CategoriadeEdad {

    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Escribir su edad: ");
        edad = tcl.nextInt();

        if ((edad >= 0) && (edad <= 13)) {
            System.out.println("usted es un niño");

        } else if ((14 <= edad) && (edad <= 17)) {
            System.out.println("Usted es adolecente");
        } else if (edad>=18){
            System.out.println("usted es adulto");
        }

    }
}

/*
*run-single:
*Escribir su edad: 18
*usted es adulto
*BUILD SUCCESSFUL (total time: 3 seconds)
*/