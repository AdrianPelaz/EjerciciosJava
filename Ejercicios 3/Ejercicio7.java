import java.util.Scanner;
/**
  *Ejercicio 7 Tema 3
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio7 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
        
    System.out.print("Introduce la base imponible: " );
    double baseImponible = s.nextDouble();
    
    System.out.print("Introduce el porcentaje del IVA: " );
    double iva = s.nextDouble();
    
    double totalFactura = baseImponible + baseImponible*iva/100;
    
    System.out.printf("El total de la factura es: " + totalFactura + " euros");
  
  }
}
