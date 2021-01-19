import java.util.Scanner;
/**
 * Ejercicio 6 Tema 3
 * 
 * @author Adrian Pelaz Medrano
 */
public class Ejercicio6{
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
   
    System.out.println("Dime el tamano de la base del triangulo: ");
    double base = s.nextDouble();
    
    System.out.println("Dime la altura del triangulo: ");
    double altura = s.nextDouble();
    
    double area = (base * altura) / 2 ;
    System.out.println("El area del triangulo es: " + area);
    
  }
}
