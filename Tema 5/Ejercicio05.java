/** Ejercicio 05 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio05 {
  public static void main(String[] args) {
    
    int num;
    int contador;
    num = 320;
    contador = 1;
    
    while (num >= 160) {
      
      System.out.println(num);
      
      num = 320;
      num = (num - (contador*20));
      contador++;
    }
  }
}
