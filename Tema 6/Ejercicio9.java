/** Ejercicio 9 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio9 {
  public static void main(String[] args) {
  
    int num,contador;
    contador = 0;
    num = 0;
    
    
    while (num != 24) {
      
      num = (int)(Math.random()*50);
      num = num*2;
      
      System.out.println(num);
      
      contador++;
      
    }
    
    System.out.println("Se han generado " + contador + " números");
    
  }
}
