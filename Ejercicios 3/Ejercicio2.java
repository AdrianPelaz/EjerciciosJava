/**
 * Ejercicio 2 Tema 3
 * 
 * @author Adrian Pelaz Medrano
 */
 public class Ejercicio2 {
   public static void main(String[] args) {
     
     String linea;
     
     System.out.print("Por favor, introduce cuantos euros quiere convertir a pesetas: ");
     linea = System.console().readLine();
     int euros;
     euros = Integer.parseInt( linea );
     
     double pesetas;
     pesetas = euros * 166.386;
     
     System.out.print( euros + " euros, son " + pesetas + " pesetas" );
   }
 }
