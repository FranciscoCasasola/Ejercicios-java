/** Ejercicio 19 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio19 {
  public static void main(String[] args) {
  
    int num,maximo,minimo,temp;
    temp = 0;
    
    maximo = -100;
    minimo = 300;
    
    for (int i = 0; i < 50; i++) {
      
      num = (int)((Math.random()*301) - 100);
      
      System.out.print(num + " ");
      
      if (num % 2 == 0) {
        
        if (num > maximo) {
         
          maximo = num;
        }
      } else {
        
          if (num < minimo) {
          
            minimo = num;
          }
      } 
      
      temp = temp + num;
      
        
        }
    
    System.out.println("\nMáximo: " + maximo);
    System.out.println("Minimo: " + minimo);
    System.out.println("Media: " + (temp/50));
      }
    }
      
