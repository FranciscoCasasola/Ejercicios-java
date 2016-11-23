/** Ejercicio 4 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio04 {
  public static void main(String[] args) {
  
    System.out.println("20 números aleatorios");
    
    for (int i = 1; i <= 20; i++) {
      
      System.out.print((int)(Math.random()*10) + " ");
      
    }
  }
}
