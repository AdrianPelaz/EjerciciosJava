/**
  *Ejercicio 5
  *
  *@author Adrian Pelaz Medrano
  */
public class Ejercicio5 {
  public static void main(String[] args) {
    
    int pesetas = 5000;
    double euros;
    double relacion = 0.006;
    double conversor = pesetas * relacion;
    
    System.out.println( pesetas + " pesetas son: " + conversor + " euros");
  }
}
