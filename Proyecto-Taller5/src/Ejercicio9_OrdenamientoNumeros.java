/*Ordenamiento de Tres Números: Dados tres números, 
ordenarlos en orden ascendente.
@author Jorge Guerrero
 */
import java.util.Scanner;

public class Ejercicio9_OrdenamientoNumeros {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        num1 = tcl.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2 = tcl.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        num3 = tcl.nextInt();

        if (num1 > num2) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }

        if (num1 > num3) {
            num1 = num1 + num3;
            num3 = num1 - num3;
            num1 = num1 - num3;
        }

        if (num2 > num3) {
            num2 = num2 + num3;
            num3 = num2 - num3;
            num2 = num2 - num3;
        }

        System.out.println("Numeros en orden ascendente: " + num1 + ", " + num2 + ", " + num3);

    }

}
/* run:
Ingresa el primer numero: 3
Ingresa el segundo numero: 5
Ingresa el tercer numero: 4
Numeros en orden ascendente: 3, 4, 5
BUILD SUCCESSFUL (total time: 5 seconds)
 */
