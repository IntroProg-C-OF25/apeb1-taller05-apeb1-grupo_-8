
import java.util.Scanner;

/**Facturación eléctrica: Desarrollar una solución que permita calcular
 * y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar 
 * el valor de costo por kilovatio/hora y el número de kilovatios consumidos
 * en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 
 * 10% por pertenecer a la tercera edad.
 * @author Andrés
 */
public class Ejercicio10_FacturadeLuz {
    public static void main(String[] args) {
        int kilov, nvat, edad, total, desc;
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingresar su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingresar el valor de costo por kilovatio/hora: ");
        kilov = tcl.nextInt();
        System.out.print("Ingresar el numero de kilovatios consumidos en el mes: ");
        nvat = tcl.nextInt();
        
        total = nvat*kilov;
        
        desc = (int) (-(total*0.1)+total);
        
        if (edad>=65){
            System.out.println("su total es: "+desc);
        }else{
            System.out.println("Su total es: "+total);
        }
        
    }
}

/*
run-single:
Ingresar su edad: 80
Ingresar el valor de costo por kilovatio/hora: 10
Ingresar el numero de kilovatios consumidos en el mes: 23
su total es: 207
BUILD SUCCESSFUL (total time: 4 seconds)
*/ 