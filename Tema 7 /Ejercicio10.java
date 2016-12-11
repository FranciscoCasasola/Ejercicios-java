/** Ejercicio 10 Tema 7 
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio10 {
  public static void main (String[] args) {
    
    int [] nums = new int [20];
    int v,j;
    int par, impar;
    v = 0;
    j = 0;
    par = 0;
    impar = 0;
    
    for (int i = 0; i < 20; i++) {
      
      nums[i] = (int)(Math.random()*101);
      
      if (nums[i] % 2 == 0) {
        
        par++;
      } else {
        
        impar++;
      }
    }
    
    
    int [] pares = new int [par];
    int [] impares = new int [impar];
    
    for (int i = 0; i < 20; i++) {
      
      if (nums [i] % 2 == 0) {
        
        pares [j] = nums [i];
        j++;
      } else {
        
        impares [v] = nums[i];
        v++;
      }
    }
    
    
    int l,m;
    l = 0;
    m = 0;
    
    for (int i = 0; i < 20; i++) {
      
      if (par > 0) {
        
        nums[i] = pares[l];
        l++;
        par--;
        
      } else {
        
        nums [i] = impares[m];
        m++;
      }
      
    }
    
    System.out.println("Array: ");
    
    for (int i = 0; i < 20; i++) {
      
      System.out.println(nums[i]);
      
    }
  }
}

