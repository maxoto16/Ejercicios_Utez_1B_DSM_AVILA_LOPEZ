package Practica_01;
import java.util.Scanner;
public class Main {
    
    public static void main (String...args){
        Scanner escanear = new Scanner(System.in);
        int edad;

System.out.println("INGRESA TU EDAD PAPU");
edad = escanear.nextInt();


if (edad < 0  || edad>120){
    System.out.println("EDAD INVALIDA");
}

        else if (edad > 17){
        System.out.println("EDAD INVALIDA");
         }

               else{
               System.out.println("MENOR DE EDAD");
               }


    } //cierra VOID
}//CIERRA LA CLASE
