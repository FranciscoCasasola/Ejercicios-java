/** Ejercicio 7 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio07{
  public static void main(String[] args) {
    
    
    int [] nums = new int [20];
    int primerValor, segundoValor;
    
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < 20; i++) {
      
      nums [i] = (int)(Math.random()*101);
      
    }
    
    for (int i = 0; i < 20; i++) {
      
      System.out.print(nums[i] + " ");
      
    }
    
    System.out.println();
    
    System.out.println("Introduce los dos números que quieres cambiar: ");
    primerValor = s.nextInt();
    segundoValor = s.nextInt();
    
    for (int i = 0; i < 20; i++) {
      
      if (nums [i] == primerValor) {
        
        nums [i] = segundoValor;
        System.out.print("'" + nums[i] + "' ");
        
      } else {
        
        System.out.print(nums[i] + " ");
      }
      
    }
  }
}
      
      
      
    
