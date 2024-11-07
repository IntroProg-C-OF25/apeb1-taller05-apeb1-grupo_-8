
/** Mayor de tres números: Dados tres números,
 *determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 *
 * @author Jorge Guerrero
 */
import java.util.Scanner;

public class Ejercicio3_MayorDeTres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n3, n2, n1;

        System.out.print("Escriba el primer entero: ");
        n1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        n2 = entrada.nextInt();

        System.out.print("Escriba el tercer entero: ");
        n3 = entrada.nextInt();

        if ((n1 == n2) || (n1 == n3) || (n2 == n3)) {
            System.out.println("Son iguales");
        } else if ((n1 > n2) && (n1 > n3)) {
            System.out.println("El mayor es = " + n1);
        } else if (n2 > n3) {
            System.out.println(" El mayor es = " + n2);
        } else {
            System.out.println(" El mayor es = " + n3);
        }
    }

}
/*run:
*Escriba el primer entero: 45
*Escriba el segundo entero: 43
*Escriba el tercer entero: 32
*El mayor es = 45
*BUILD SUCCESSFUL (total time: 34 seconds)
*/