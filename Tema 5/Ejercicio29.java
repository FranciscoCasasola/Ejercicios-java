/** Ejercicio 29 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio29 {
  public static void main(String[] args) {
    
    int num,num2;
    
    System.out.print("Introduce un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce un segundo número: ");
    num2 = Integer.parseInt(System.console().readLine());
    
    while (num != 0) {
      
      if(num % num2 != 0) {
        
        System.out.println(num);
      }
      num--;
    }
  }
}
