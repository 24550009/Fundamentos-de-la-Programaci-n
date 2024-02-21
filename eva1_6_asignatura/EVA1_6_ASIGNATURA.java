/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //carrera, nomobre,clave
        String carrera, clave, nombre;
        Boolean TipoDeMateria;
        int creditos, horasTeoria, horasPractica;
        //captura
        Scanner captura= new Scanner(System.in);
        System.out.println("Introduce la caleve de la asignatura:");
        clave= captura.nextLine();
        System.out.println("Introduce la carrera de la asignatura:");
        carrera= captura.nextLine();
        System.out.println("Introduce tu nombre:");
        nombre= captura.nextLine();
        System.out.println("Introduce los creditos de la asignatura:");
        creditos= captura.nextInt();
        System.out.println("Introduce los horas teoricas de la asignatura:");
        horasTeoria= captura.nextInt();
        System.out.println("Introduce las horas de practica de la asignatura:");
        horasPractica= captura.nextInt();
        System.out.println("Introduce el tipo de asigantira[true---->generica, false---->especial:");
        TipoDeMateria= captura.nextBoolean();
        System.out.println("Tus datos son");
        System.out.println("Tucalve es: " +clave);
        System.out.println("Tu nombre es: " +nombre);
        System.out.println("Tu carrera es: " +carrera);
        System.out.println("Los creditos de la materia son: " +creditos);
        System.out.println("Las horas de paractica de la materia son: " +horasPractica);
        System.out.println("Lashoras de teroa de la materia son: " +horasTeoria);
        System.out.println("El tiop de materia es: "+TipoDeMateria);
        
        
    }
    
}
