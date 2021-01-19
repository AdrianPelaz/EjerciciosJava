/**
 * Ejercicio 3
 * 
 * @author Adrian Pelaz Medrano
 */
 public class Ejercicio3 {
   public static void main(String[] args) {
     
     String linea;
     
     System.out.print("Por favor, introduce cuantas pesetas quiere convertir a euros: ");
     linea = System.console().readLine();
     int pesetas;
     pesetas = Integer.parseInt( linea );
     
     double euros;
     euros = pesetas / 166.386;
     
     System.out.print( pesetas + " pesetas, son " + euros + " euros" );
   }
 }
