
import java.util.Scanner;

/***Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado
 * (1 para lunes, 2 para martes, etc.).
 * @author Andrés
 */
public class Ejercicio2_DiadelaSemana {
    public static void main(String[] args) {
        int numdia;
        Scanner tcl = new Scanner(System.in);

        System.out.print("escribir el numero de dia: ");
        numdia = tcl.nextInt();

        switch (numdia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabados");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error en el numero");

        }

    }
}

/*compile-single:
*run-single:
*escribir el numero de dia: 4
*Jueves
*BUILD SUCCESSFUL (total time: 9 seconds)
*/