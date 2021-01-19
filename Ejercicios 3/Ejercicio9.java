import java.util.Scanner;
/**
  *Ejercicio 9 Tema 3
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio9 {
  public static void main(String[] args) {
	  
	  Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce el radio del cono en cm: " );
    double r = s.nextDouble();
    
    System.out.print("Introduce la altura del cono en cm: " );
    double h = s.nextDouble();
        
    double volumen = 1/3 * 3.14159265359 * (r * r) * h;
    
    System.out.printf("El volumen del cono es: " + volumen + " cm³");
  }
}
