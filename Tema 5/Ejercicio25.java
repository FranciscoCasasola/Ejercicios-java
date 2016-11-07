/** Ejercicio 25 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio25 {
  public static void main(String[] args) {
  
    int num,temp;
    
    System.out.print("Introduca un número para verlo del reves: ");
    num = Integer.parseInt(System.console().readLine());
    
    while (num > 0) {
      
      temp = num%10;
      System.out.print(temp);
      num = num / 10;
    }
  }
}
      
      
