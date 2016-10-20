/** Ejercicio 17 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio17 {
  public static void main(String[] args) {
    
    int x;
    
    System.out.print("Introduce un número entero: ");
    
    x = Math.abs(Integer.parseInt(System.console().readLine()));
    
    System.out.print("Este es el ultimo número " + (x%10));
    
  }
}
    
