/*En una hosteria de la ciudad de Loja se hace un descuento del 10% si el 
cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20%
si se hospeda más de 15 días. Elaborar un solución que pida como datos de 
entrada el número de días y el precio diario de la habitación y luego calcule e 
imprima el subtotal por pagar, el descuento y el total por pagar.
@author Jorge Guerrero
 */
import java.util.Scanner;

public class Ejercicio13_ReservasHoteleras {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double dias, precioDia, costoT, descuento, costoDescuento;

        System.out.print("Dias de estancia: ");
        dias = tcl.nextDouble();

        System.out.print("Precio por dia: ");
        precioDia = tcl.nextDouble();

        costoT = precioDia * dias;

        if ((dias >= 6) && (dias <= 10)) {
            descuento = costoT * 0.1;
            costoDescuento = costoT - descuento;
            System.out.println("Costo total = " + costoDescuento);
        } else if ((dias >= 11) && (dias <= 15)) {
            descuento = costoT * 0.15;
            costoDescuento = costoT - descuento;
            System.out.println("Costo total = " + costoDescuento);
        } else if (dias >= 16) {
            descuento = costoT * 0.2;
            costoDescuento = costoT - descuento;
            System.out.println("Costo total = " + costoDescuento);
        } else {
            System.out.println(" Costo total = " + costoT);
        }

    }
}
/*run:
Dias de estancia: 11
Precio por dia: 5
Costo total = 46.75
BUILD SUCCESSFUL (total time: 5 seconds)
*/