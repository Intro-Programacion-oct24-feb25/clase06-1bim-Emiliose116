/*
Ingrse la fecha de nacimiento

Día: 7
mes: 2
año: 1980

usted ha nacido el 7 de FEBRERO DE 1980
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int dia;
        int mes;
        int year;

        System.out.println("Ingrese el número de día del mes");
        dia = entrada.nextInt();
        
        System.out.println("Ingrese el número de mes");
        mes = entrada.nextInt();
        
        System.out.println("Ingrese el año");
        year = entrada.nextInt();

        switch (mes) {
            case 1:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "ENERO",year);
                break;

            case 2:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "FEBRERO",year);
                break;

            case 3:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "MARZO",year);
                break;

            case 4:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "ABRIL",year);
                break;

            case 5:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "MAYO",year);
                break;

            case 6:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "JUNIO",year);
                break;

            case 7:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "JULIO",year);
                break;
                
            case 8:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "AGOSTO",year);
                break;
            
            case 9:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "SEPTIEMBRE",year);
                break;
                
            case 10:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "OCTUBRE",year);
                break;  
                
            case 11:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "NOVIEMBRE",year);
                break;
               
            case 12:
                System.out.printf("usted ha nacido el %d es %s de %d\n", dia, 
                        "DICIEMBRE",year);
                break;    

            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }
}
