import java.util.Scanner;
/**
 * Ejercicio 4 Tema 3
 * 
 * @author Adrian Pelaz Medrano
 */
public class Ejercicio4 {
   public static void main(String[] args) {
     
     Scanner s = new Scanner(System.in);
     
     System.out.print("Introduce dos numero enteros, separados por espacios: ");
     int n1 = s.nextInt();
     int n2 = s.nextInt();
     
     int suma;
     suma = n1 + n2;
     int resta;
     resta = n1 - n2;
     int multiplicacion;
     multiplicacion = n1 * n2;
     double division;
     division = n1 / n2;
     
     System.out.println(n1 + "+" + n2 + "=" + suma);
     System.out.println(n1 + "-" + n2 + "=" + resta);
     System.out.println(n1 + "*" + n2 + "=" + multiplicacion);
     System.out.println(n1 + "/" + n2 + "=" + division);
   }
 }
