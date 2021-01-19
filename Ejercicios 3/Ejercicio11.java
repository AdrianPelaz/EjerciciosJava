import java.util.Scanner;
/**
  *Ejercicio 11 Tema 3
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio11 { 
  public static void main(String[] args) {
	  
	  Scanner s = new Scanner (System.in);
  
    System.out.print("Introduce los Kb a convertir en Mb: " );
    int kb = s.nextInt();
             
    double mb = kb / 1000;
    
    System.out.print(kb + " Kb son: " + mb + " Mb");
    
  }
}

