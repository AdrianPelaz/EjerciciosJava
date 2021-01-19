/**
 * Ejercicio 1
 * 
 * @author Adrian Pelaz Medrano
 */
 public class Ejercicio1 {
   public static void main(String[] args) {
   
   String linea;
   
   System.out.print("Por favor introduce un numero: ");
   linea = System.console().readLine();
   int primerNumero;
   primerNumero = Integer.parseInt( linea );
   
   System.out.print("Por favor introduce otro numero: ");
   linea = System.console().readLine();
   int segundoNumero;
   segundoNumero = Integer.parseInt( linea );
   
   int multiplicacion;
   multiplicacion = primerNumero * segundoNumero;   
   System.out.print(primerNumero + " * " + segundoNumero + " = " + multiplicacion);
 }
}
 
