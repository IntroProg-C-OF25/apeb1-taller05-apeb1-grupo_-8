/*Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. 
*Si es bisiesto, mostrar un mensaje especial.
 */
import java.util.Scanner;

public class Ejercicio5_AnoBisiesto {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int ano;

        System.out.print("Ingrese tu ano: ");
        ano = tcl.nextInt();

        if (ano % 4 == 0) {
            System.out.println("El ano el bisiesto");
        } else {
            System.out.println("El ano no es bisiesto");
        }

    }

}
/*run:
Ingrese tu ano: 5676
El ano el bisiesto
BUILD SUCCESSFUL (total time: 15 seconds)
*/
