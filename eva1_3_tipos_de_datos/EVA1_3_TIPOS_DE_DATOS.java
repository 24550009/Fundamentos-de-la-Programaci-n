/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_tipos_de_datos;

/**
 *
 * @author invitado
 */
public class EVA1_3_TIPOS_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte pruebaByte; //un byte=8 bites 2-> 256
        //pruebaByte= 256;//256 no cabe en la varaible
        pruebaByte= -127;
        pruebaByte= 127;//acepta de -128 a 127
        pruebaByte= -128;
        
        
        short pruebaShort;//2 byte = 16 bites--->65536
        pruebaShort= -32768; 
        pruebaShort= 32767;
        System.out.println(pruebaShort);//imprimne la varaible pruebaShort
        pruebaShort++;//++ es un operador,suma 1 al comtenido de la variable
        System.out.println(pruebaShort);
        // TODO code application logic here
    }
    
}
