/** Ejercicio 16 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio16 {
  public static void main (String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int [] nums = new int [20];
    int x;
    
    for (int i = 0; i < 20; i++) {
      
      nums[i] = (int)(Math.random()*401);
    }
    
    System.out.println("Este es el array incial");
    
    for (int i = 0; i < 20; i++) {
      
      System.out.print(nums[i] + " ");
    }
    
    System.out.println("Que números quiere resaltar? (1-Multiplos de 5, 2-Multiplos de 7): ");
    x = s.nextInt();
    
    if (x == 1) {
      
      for (int i = 0; i < 20; i++) {
        
        if (nums[i] % 5 == 0) {
          
          System.out.print("[" + nums[i] + "] ");
        } else {
          
          System.out.print(nums[i] + " ");
        }
      }
    } else if (x == 2) {
      
      for (int i = 0; i < 20; i++) {
        
        if (nums [i] % 7 == 0) {
          
          System.out.print("[" + nums[i] + "] ");
        } else {
          
          System.out.print(nums[i] + " ");
        }
      }
    } else {
      
      System.out.println("El número introducido es el equivocado");
    }
            
    
    
    
    
        
    }
    
  }

