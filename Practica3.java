package practica3;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
        

        int a =0;
        System.out.println("Que deseas hacer");
        System.out.println("1.Hacer un ingreso a la cuenta Juan");
        System.out.println("2.Hacer un reintegro a la cuenta Juan");
        System.out.println("3.Hacer una tranferencia a la cuenta de Pepe");
        System.out.println("4.Salir");


        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción;");
        a = sc.nextInt();
            
            switch (a) {
                case 1:
                    System.out.println("1.Hacer un ingreso a la cuenta Juan");
                    cuentabancaria.ingresarDinero();
                    break;
                case 2:
                    System.out.println("2.Hacer un reintegro a la cuenta Juan");
                    cuentabancaria.reintegroDinero();
                    break;
                case 3:
                    System.out.println("3.Hacer una tranferencia a la cuenta Pepe");
                    cuentabancaria.transferirDinero();
                    break;
                case 4:
                    
                    break;
            }
        
    }
}



