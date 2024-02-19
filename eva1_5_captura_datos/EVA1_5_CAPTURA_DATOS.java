/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_datos;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA1_5_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar nuestras variables
        String nombre;
        int edad;
        System.out.println("introduce tu nombre:");
        //crear nuestro scanner
        Scanner captura = new Scanner(System.in);
        //captura
        nombre = captura.nextLine();
        System.out.println("introduce tu edad");
        edad= captura.nextInt();
        System.out.println("Tu nombre es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:");
        System.out.println(edad);
        
        // TODO code application logic here
    }
    
}
