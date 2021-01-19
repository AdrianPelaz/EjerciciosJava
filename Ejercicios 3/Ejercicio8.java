import java.util.Scanner;
/**
  *Ejercicio 8 Tema 3
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio8 {
  public static void main(String[] args) {
	  
	  Scanner s = new Scanner(System.in);
        
    System.out.print("Introduce las horas trabajadas esta semana: " );
    double horasTrabajadas = s.nextDouble();
        
    double salarioSemanal = horasTrabajadas*12;
    
    System.out.printf("El salario semanal es de: " + salarioSemanal + " euros");
  
  }
}
