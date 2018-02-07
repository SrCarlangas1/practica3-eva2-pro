package practica3;

import java.util.ArrayList;
import java.util.Scanner;


public class cuentabancaria {

    static void ingresarDinero(ArrayList<cuentabancaria> listaCuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String nombre_cliente;
    private String nombre_cuenta;
    private double tipo_interes;
    private double saldo;


    public cuentabancaria(String nombre_cliente, String nombre_cuenta, double tipo_interes, double saldo) {
        this.nombre_cliente = nombre_cliente;
        this.nombre_cuenta = nombre_cuenta;
        this.tipo_interes = tipo_interes;
        this.saldo = saldo;
    }
    
    
    
    public cuentabancaria() {
    }
    


    public cuentabancaria(cuentabancaria p){
        this.nombre_cliente=p.nombre_cliente;
        this.nombre_cuenta=p.nombre_cuenta;
        this.tipo_interes=p.tipo_interes;
        this.saldo=p.saldo;
     
    }

/*------------------------------------*/    

// get de cuenta bancaria
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getNombre_cuenta() {
        return nombre_cuenta;
    }

    public double getTipo_interes() {
        return tipo_interes;
    }

    public double getSaldo() {
        return saldo;
    }
    
/*------------------------------------*/

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    public void setTipo_interes(double tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
/*------------------------------------*/
    

    static public void ingresarDinero() {
        cuentabancaria juan = new cuentabancaria("juan","hola",8.6,5886);
        System.out.println("Cuanto deseas ingresar a tu cuenta Juan");
        Scanner ingresar = new Scanner(System.in);
        int meter=ingresar.nextInt();
        System.out.println("Tienes la cantidad de " +" " +" " + juan.getSaldo() +" " +" " +"y vas ingresar" +" " +" " + meter);
        juan.setSaldo(juan.getSaldo()+meter);
        System.out.println("El salto todal es" +" " +" " + juan.getSaldo());
        
    }
    
    static public void reintegroDinero() {
        cuentabancaria juan = new cuentabancaria("juan","hola",8.6,5886);
        System.out.println("Cuanto deseas retirar de la cuenta Juan");
        Scanner ingreso = new Scanner(System.in);
        int mete=ingreso.nextInt();
        if (mete<juan.getSaldo()){
        System.out.println("Tienes la cantidad de " +" " +" " + juan.getSaldo() +" " +" " +"y vas retirar" +" " +" " + mete);
        juan.setSaldo(juan.getSaldo()-mete);
        System.out.println("El salto todal es" +" " +" " + juan.getSaldo());
        System.out.println("Saldo retirado");
        }
        else{
        System.out.println("No puedes retirar mas de lo que tienes");
        }
        
    }
    
    
    static public void transferirDinero() {
        cuentabancaria juan = new cuentabancaria("juan","hola",8.6,5886);
        cuentabancaria pepe = new cuentabancaria("pepe","hola",8.6,1856);
        System.out.println("Cuanto deseas transferir a la cuenta de Pepe");
        Scanner ingreso = new Scanner(System.in);
        int mete=ingreso.nextInt();
        
        if (mete<juan.getSaldo()){
        System.out.println("Tienes la cantidad de " +" " +" " + juan.getSaldo() +" " +" " +"y vas retirar" +" " +" " + mete);
        juan.setSaldo(juan.getSaldo()-mete);
        System.out.println("El salto todal es" +" " +" " + juan.getSaldo());
        System.out.println("Saldo retirado");
        }
        else{
        System.out.println("No puedes transferir mas direno del que tienes");
        }
        
    }

}




