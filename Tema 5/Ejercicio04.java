/** Ejercicio 04 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio04 {
  public static void main(String[] args) {
    
    
    int num;
    int contador;
    num = 320;
    
    for (contador = 1; num >= 160; contador++) {
      
      System.out.println(num);
      
      num = 320;
      num = (num - (contador*20));
      
    }
  }
}
