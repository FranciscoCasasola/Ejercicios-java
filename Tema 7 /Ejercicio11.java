/** Ejercicio 11 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio11 {
  public static void main (String[] args) {
  
    int [] nums = new int [10];
    int [] primos = new int [10];
    int [] aux = new int [10];
    boolean primo;
    int p = 0;
    int a = 0;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca los números de uno en uno: ");
    
    for (int i = 0; i < 10; i++) {
      
      nums[i] = s.nextInt();
    }
    
    for (int i = 0; i < 10; i++) {
      
      primo = true;
      
      for (int j = 2; j < nums[i]; j++) {
        
        if(nums[i] % j == 0) {
          
          primo = false;
          
        }
      }
      if (primo == true) {
        
        primos[p] = nums[i];
        p++;
      } else {
        
        aux [a] = nums [i];
        a++;
      }
        
      
    }
    
    int j = 0;
    int m = 0;
    
    
    for (int i = 0; i < 10; i++) {
    
      if (p > 0) {
        
        nums [i] = primos[j];
        j++;
        p--;
        
      } else {
        
        nums [i] = aux[m];
        m++;
      }
      
  }
    
    
    System.out.println("Array: ");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.println(nums[i]);
      
    }
    
  }
}
