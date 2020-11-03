/**
  *Ejercicio 6
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    double total;
    double baseImponible = 1000;
    double iva = 0.21;
    
    total = baseImponible + baseImponible * iva;
    
    System.out.println("Base imponible: " + baseImponible + " euros");
    System.out.println("Total de la factura: " + total + " euros");
  
  }
}
