/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Existe una modificación en el proceso de la problemática el porcentaje del 
descuento por seguro será ingresado por teclado. Considerar los valores posibles
a ingresar son entre uno y quince si la persona ingresa un valor fuera de este 
rango el valor del porcentaje va a ser 10
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ComercioTres {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2

        /*Hay que analizar el problema hasta el reporte para entender las 
        variables fijas*/
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;

        double productividad;
        double coeficiente = 0.6;
        double bono = 0;

        double porcentajeSeguro;
        double porcentajeFinal = 0;
        double adicionalSeguro;

        double sueldoFinal;

        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();

        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje del seguro");
        porcentajeSeguro = entrada.nextDouble();

        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();

        // calcular la productividad
        productividad = numeroProductos * coeficiente;

        if (productividad <= 30) {
            bono = 25; // $25
        } else {
            if (productividad >= 31 && productividad < 80) {
                bono = 50;
            } else {
                if (productividad >= 80 && productividad < 200) {
                    bono = 100;
                } else {
                    if (productividad >= 200) {
                        bono = 200;
                    }
                }
            }
        }
        
        
        /*
        En este caso mi solucion presenta dos variables. Agregue una variable 
        llamada "porcentjeFinal".
        
        Apesar de que usé otro método, la solucíón correcta tomando en cuenta la
        clase es:
        opción 3
        if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            porcentajeFinal = 10;
        
        
        // opción 1
        if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            porcentajeSeguro = porcentajeSeguro + 0;
        } else {
            porcentajeSeguro = 10;
        // opción 4
        if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        Porque no se puede usar && 
        porque no hay numero que cumpla las dos
        condiciones a pesar de todo va a funcionar pero no eslo adecuado para la
        resolucion del problema
        
        // opción 2
        if (porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        
        Aquí no toman en cuenta los posibles números negativos
        */
       
        if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            porcentajeFinal = porcentajeSeguro;
        } else {
            if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
                porcentajeFinal = 10;
            }
        }
        
        adicionalSeguro = (sueldoBasico * porcentajeFinal) / 100;
        /*es mejor
        usar una variable que un numero
         */
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;

        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n",
                nombre,
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);

        //
    }

}
