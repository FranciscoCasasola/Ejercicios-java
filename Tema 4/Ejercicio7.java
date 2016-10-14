/** Ejercicio 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    double a,b,c;
    
    System.out.print("Introduzca tres notas a continuación: ");
    
    a = s.nextDouble();
    b = s.nextDouble();
    c = s.nextDouble();
    
    System.out.println("La media de la notas es " + ((a+b+c)/3) );
    
  }
}
    
