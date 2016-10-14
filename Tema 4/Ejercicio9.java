/** Ejercicio 9
 *
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) { 
    
    Scanner s = new Scanner(System.in);
    
    double a,b,c;
    double x,x2;
    double interiorRaiz,b2,raiz;
    
    System.out.print("Introduce las variables a b y c (separadas por espacio): ");
    
    a = s.nextDouble();
    b = s.nextDouble();
    c = s.nextDouble();
    
    b2 = b*b;
    
    interiorRaiz = (b2) - (4*a*c);
    raiz = Math.sqrt(interiorRaiz);
    
    if (interiorRaiz > 0) {
    
    System.out.println("X1 es igual a " + (((-b) + (raiz)) / (2*a)));
    System.out.println("X2 es igual a " + (((-b) - (raiz)) / (2*a)));
    
  } else {
    
    System.out.println("No tiene solucion");
    
   } 
  }
  
}
    
    
    
    
