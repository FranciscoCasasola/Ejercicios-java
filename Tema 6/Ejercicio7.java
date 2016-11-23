/** Ejercicio 7 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio7 {
  public static void main(String[] args) {
  
    
    int num,fila;
    fila = 0;
    
    
    
      while (fila < 15) {
        
        
        for (int i = 3; i > 0; i--) {
          
           num = (int)((Math.random()*3) + 1);
          
          if (num == 3) {
            
            System.out.printf("%3s", "x");
          
          
        } else {
          
           System.out.printf("%3d", num);
           
         }
         
       }
       System.out.println();
       
       fila++;
       
     }
   }
 }
         
         
      
          
        
        
        
      
