import java.util.Scanner;
/**
  *Ejercicio 12 Tema 3
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio12 {
  public static void main(String[] args) {
	  
	  Scanner s = new Scanner (System.in);
  
    System.out.print("Inserte la del nota primer examen: " );
    double nota1Examen = s.nextDouble();
    
    System.out.print("Inserte la media deseada: " );
    double mediaDeseada = s.nextDouble();
             
    double nota2Examen = (mediaDeseada-nota1Examen*0.4) / 0.6;
    
    System.out.printf("La nota que te hace falta sacar en el segundo examen de Programación para obtener un " + mediaDeseada + " en el trimestre es: " + nota2Examen);
    
  }
}
