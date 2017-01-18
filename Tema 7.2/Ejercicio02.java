/** Ejercicio 02 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio02 {
  public static void main (String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int [][] nums = new int [5][6];
    int aux = 0;
    
    System.out.println("Introduce 20 números enteros: ");
    
    for (int i = 0; i < 4; i++) {
      
      for (int j = 0; j < 5; j++) {
        
        nums[i][j] = s.nextInt();
      }
    } 
    //Muestra los datos y las sumas parciales de la columna.
    
    for (int i = 0; i < 4; i++) {
       
      for (int j = 0; j < 5; j++) {
        
        nums[i][5] = nums[i][5] + nums[i][j];
      }
    }
    
    for (int i = 0; i < 6; i++) {
      
      for (int j = 0; j < 4; j++) {
        
        nums[4][i] = nums[4][i] + nums[j][i];
        
      }
    }
    
    for (int i = 0; i < 5; i++) {
      
      for (int j = 0; j < 6; j++) {
        
        System.out.print(nums[i][j] + " ");
      }
      
      System.out.println();
    }
  }
}
