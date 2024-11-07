
import java.util.Scanner;

/**
 * Descuento en Compras: Calcular el precio final de un producto con un
 * descuento del 10% si el precio original es mayor de $100; de lo contrario, no
 * hay descuento.
 *
 * @author Andrés
 */
public class Ejercicio4_DescuentoenCompras {
     public static void main(String[] args) {
        double producto, descuento;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingresar el precio de su producto: ");
        producto = tcl.nextDouble();

        descuento = -(producto * (0.1)) + producto ;

        if (producto > 100) {
            System.out.println("Su producto tiene un descuento del 10% asi que su total es: " + descuento);
        } else {
            System.out.println("Su producto no tiene descuento asi que se mantiene en: " + producto);
        }
    }
}


