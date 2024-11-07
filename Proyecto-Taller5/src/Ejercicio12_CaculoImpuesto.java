
import java.util.Scanner;

/**
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de
 * un automóvil (marca, origen y costo) imprima el impuesto por pagar y el
 * precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto
 * es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de
 * USA, 8%
 *
 * @author Andrés
 */
public class Ejercicio12_CaculoImpuesto {

    public static void main(String[] args) {
        String marca, origen;
        int costo;
        Scanner tcl = new Scanner(System.in);

        System.out.print("Escriba la marca del carro: ");
        marca = tcl.next();
        System.out.print("Escriba el pais de origen: ");
        origen = tcl.next();
        System.out.print("Escriba el costo del automovil: ");
        costo = tcl.nextInt();

        switch (origen) {
            case "japon":
                System.out.printf("la marca del automovil es: " + marca
                        + "%nel pais de origen es: " + origen
                        + "%nel costo total es: " + ((costo * 0.3) + costo)
                        + "%n");
                break;
            case "usa":
                System.out.printf("la marca del automovil es: " + marca
                        + "%nel pais de origen es: " + origen
                        + "%nel costo total es: " + ((costo * 0.08) + costo)
                        + "%n");
                break;
            case "italia":
                System.out.printf("la marca del automovil es: " + marca
                        + "%nel pais de origen es: " + origen
                        + "%nel costo total es: " + ((costo * 0.15) + costo)
                        + "%n");
                break;
            case "alemania":
                System.out.printf("la marca del automovil es: " + marca
                        + "%nel pais de origen es: " + origen
                        + "%nel costo total es: " + ((costo * 0.2) + costo)
                        + "%n");
                break;
            default:
                System.out.printf("la marca del automovil es: " + marca
                        + "%nel pais de origen es: " + origen
                        + "%nel costo total es: " +  costo 
                        + "%n");
        }

    }
}
