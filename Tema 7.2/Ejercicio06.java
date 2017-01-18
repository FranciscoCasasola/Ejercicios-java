/** Ejercicio 06 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio06 {
  public static void main (String[] args) {
  
    
    int [][] nums = new int [6][10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < 6; i++) {
      
      for (int j = 0; j < 10; j++) {
        
        nums [i][j] = (int)(Math.random()*1001);
        
        for (int n = 0; n < i; n++) {
          
          for (int m = 0; m < j; m++) {
            
            if (nums[i][j] == nums[n][m]) {
              
              nums[i][j] = (int)(Math.random()*1001);
            }
          }
        }
        
        if (nums[i][j] > max) {
          
          max = nums[i][j];
        }
        if (nums[i][j] < min) {
          
          min = nums[i][j];
        }
      }
    }
    
    
    
    for (int i = 0; i < 6; i++) {
      
      for (int j = 0; j < 10; j++) {
        
        System.out.print(nums[i][j] + " ");
      }
    }
    
    System.out.println();
    System.out.println("Este es el número máximo: " + max);
    System.out.println("Este es el número mínimo: " + min);
    
    
  }
}

