/** Ejercicio 12 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
  
    int num;
    
    
    for (int i = 50; i > 0; i--) {
      
      for (int j = 30; j > 0; j--) {
        
        num = (int)((Math.random()*33) + 94);
        char c = (char)num;
        
        System.out.print(c);
        
      }
      System.out.println();
    }
  }
}
