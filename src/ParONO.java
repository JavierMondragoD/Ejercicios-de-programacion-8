/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class ParONO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ingreso = new Scanner(System.in);
    int numero;
   
    System.out.print("Ingresa un numero: ");
    numero = ingreso.nextInt();
   
    if(numero % 2 == 0){
      System.out.println("El numero es par");
    }
    else{
      System.out.println("El numero es impar");
    }
    }
    
}
