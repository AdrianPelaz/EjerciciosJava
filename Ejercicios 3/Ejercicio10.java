import java.util.Scanner;
/**
  *Ejercicio 10 Tema 3
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio10 { 
  public static void main(String[] args) {
	  
	  Scanner s = new Scanner (System.in);
  
    System.out.print("Introduce los Mb a convertir en Kb: " );
    int mb = s.nextInt();
             
    int kb = mb * 1000;
    
    System.out.print(mb + " Mb son: " + kb + " Kb");
    
  }
}

