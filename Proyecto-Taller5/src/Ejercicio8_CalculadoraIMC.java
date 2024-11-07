
import java.util.Scanner;

/**
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona
 * y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso,
 * etc.).
 */
public class Ejercicio8_CalculadoraIMC {

    public static void main(String[] args) {
        int peso;
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("ingrese su peso corporal");
        peso = tcl.nextInt();
        
        if (peso<=49){
            System.out.println("usted tiene desnutricion");
        }else if(peso<=64){
            System.out.println("usted tiene un peso normal");
        }else {
            System.out.println("Usted tiene sobrepeso");
        }
        
    }
}

/*
run-single:
ingrese su peso corporal 90
Usted tiene sobrepeso
BUILD SUCCESSFUL (total time: 4 seconds)
*/