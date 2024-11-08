/*Pedidos online: Desarrollar una solución que imprima el costo de un pedido de 
un artículo del cual se tiene la descripción, la cantidad que se requiere y el 
precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un 
descuento de 15%.
@author Jorge Guerrero
 */
import java.util.Scanner;

public class Ejercicio11_PedidosOnline {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        double producto, cantidadProd, costo_d, descuento;
        System.out.print("Ingrese el precio del producto: ");
        producto = tcl.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        cantidadProd = tcl.nextDouble();

        double costo_T = producto * cantidadProd;

        if (cantidadProd > 50.0) {
            descuento = producto * 0.15;
            costo_d = costo_T - descuento;
            System.out.println("Costo total = " + costo_d);
        } else {
            System.out.println("Costo total = " + costo_T);

        }

    }
}
/* run:
Ingrese el precio del producto: 5
Ingrese la cantidad de productos: 55
Costo total = 274.25
BUILD SUCCESSFUL (total time: 7 seconds)
*/
