
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio1 {

 
    public static void main(String[] args)throws IOException{
        String nombre; //String para definir variables de tipo cadena
        int edad;  //int para definir variables de tipo entero
        
         //captura de datos del teclado
        InputStreamReader entrada = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(entrada);
    
         //mortrar mensaje en pantalla
        System.out.println("Ingrese su Nombre: ");
        //leer los datos desde el teclado en la variable nombre
        
        nombre = br.readLine();
    
        System.out.println("Ingrese Su Edad:");
        //se convierte a entero el string leido utilizando Integer.ParseInt
        edad = Integer.parseInt(br.readLine());
        
        
        if (edad >= 18) 
        {
            System.out.println(nombre+"su edad es"+edad+"años, y es mayor de edad");
        }
        else
        {
         System.out.print(nombre+"su edad es"+edad+"años, y es menor de edad ");
    }
    
 }
}