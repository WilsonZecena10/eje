
package myarray_01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



interface Array01{
   int[]number = new int[10];
}

public class Myarray_01 implements Array01{

   
    public static void llenarArreglo() {
          Random r = new Random();
          
          for (int i = 0; i < 10; i++){
            number[i] = r.nextInt(99) + 1;
          }
    }
    
    public static void mostrarArreglo(){
        for(int i = 0; i < 10; i++){
            System.out.print("[ " + number[i] + "] ");
        }
        System.out.println("\n");
    }
    
    public static void arregloAsc(){
        Arrays.sort(number);
        for (int i = 0; i < 10; i++){
             System.out.print("[ " + number[i] + "] ");
        }
        System.out.println("\n");
    }
    
    public static void arregloDesc(){
        Arrays.sort(number);
        for (int i = 10 -1 ; i > 0; i--){
             System.out.print("[ " + number[i] + "] ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int var;
       

        OUTER:
        do {
            System.out.println("1. Llenar Arreglo");
            System.out.println("2. Ordenar ascendente");
            System.out.println("3. Ordenar descendente");
            System.out.println("4. Mostrar Arreglo");
            System.out.println("5. Salir");
            var = sca.nextInt();
            switch (var) {
                case 1 -> llenarArreglo();
                case 2 -> arregloAsc();
                case 3 -> arregloDesc();
                case 4 -> mostrarArreglo();
                default -> {
                    break OUTER;
                }
            }
        } while (var != 5);
    }
}
