/** Ejercicio 17 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio17 {
  public static void main (String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int [] nums = new int [10];
    int x,aux;
    boolean igual;
    
    for (int i = 0; i < 10; i++) {
      
      nums[i] = (int)(Math.random()*101);
    }
    
    System.out.println("Este es el array");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print(nums[i] + " ");
    }
    
    System.out.println();
    
    do {
      igual = false;
      
      System.out.print("Introduzca un número: ");
      x = s.nextInt();
    
      for (int i = 0; i < 10; i++) {
        
        if (x == nums[i]) {
          
          igual = true;
        }
      }
    } while (igual == false);
    
    
    
    while (nums[0] != x) {
      
      aux = nums[9];
      for (int i = 9; i > 0; i--) {
        
        nums [i] = nums[i-1];
      }
      nums [0] = aux;   
    }
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print(nums[i] + " ");
    }
    
    
    
    
  }
}
