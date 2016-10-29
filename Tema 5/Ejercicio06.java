/** Ejercicio 06 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio06 {
  public static void main(String[] args) {
    
    int num;
    int contador;
    contador = 1;
    num = 320;
    
    do {
      
      System.out.println(num);
      num = 320;
      num = (num - (contador*20));
      contador++;
      
    } while ( num >= 160);
  }
}
