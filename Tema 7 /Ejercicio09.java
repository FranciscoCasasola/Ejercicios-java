/** Ejercicio 09 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {


    int [] nums = new int [8];
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca 8 números de uno en uno: ");
    
    for (int i = 0; i < 8; i++) {
      
      nums [i] = s.nextInt();
      
    }
    
    for (int i = 0; i < 8; i++) {
      
      if (nums [i] % 2 == 0) {
        
        System.out.println("Par: " + nums[i]);
        
      } else {
        
        System.out.println("Impar: " + nums[i]);
        
      }
      
    }
    
    
      }
    }
