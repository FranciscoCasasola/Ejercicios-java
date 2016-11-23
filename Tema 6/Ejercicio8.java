/** Ejercicio 8 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio8 {
  public static void main(String[] args) {
  
    int num,fila;
    fila = 0;
    
      while (fila < 15) {
        
        for (int i = 3; i > 0; i--) {
          
          num = (int)((Math.random()*6) + 1);
          
          if (num == 1 || num == 2 || num == 3) {
            
            System.out.printf("%3s", "1");
          
          } else if (num == 4 || num == 5) {
            
            System.out.printf("%3s", "x");
          
          
        } else {
          
           System.out.printf("%3s", "2");
           
         }
         
       }
       System.out.println();
       
       fila++;
       
     }
   }
 }
