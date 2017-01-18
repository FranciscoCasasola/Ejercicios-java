/** Ejercicio 04 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio04 {
  public static void main (String[] args) 
    throws InterruptedException {
      
      int [][] nums = new int [5][6];
      int aux = 0;
    
      System.out.println("Introduce 20 números enteros: ");
    
      for (int i = 0; i < 4; i++) {
      
        for (int j = 0; j < 5; j++) {
        
          nums[i][j] = (int)((Math.random()*900)+100);
        }
      } 
      //Muestra los datos y las sumas parciales de la columna.
    
      for (int i = 0; i < 4; i++) {
       
        for (int j = 0; j < 6; j++) {
        
          nums[i][5] = nums[i][5] + nums[i][j];
          System.out.print(nums[i][j] + " ");
          if (i == 3) {
            
            Thread.sleep(1000);
          }
        }
        System.out.println();
      }
      //Muestra los datos y las sumas parciales de la fila.
    
      for (int i = 0; i < 6; i++) {
      
        for (int j = 0; j < 4; j++) {
        
          nums[4][i] = nums[4][i] + nums[j][i];
        }
        
        System.out.print(nums[4][i] + " ");
        Thread.sleep(1000);
      }
    
      //Imprime la tabla por pantalla
    
      
    }
  }
 
