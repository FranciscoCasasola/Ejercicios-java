/** Ejercicio 5
 *
 *
 * @author Francisco Casasola Cano
 */
 import java.util.Scanner;
 
 
 
public class Ejercicio5 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    double x;
    double a,b;
    
    System.out.print("Introduzca los valores a y b para resolver la ecuación 'ax + b = 0' ");
    
    a = s.nextDouble();
    b = s.nextDouble();
    
    x = (-b/a);
    
    System.out.println("x es igual a " + x );
    
  }
}

 
