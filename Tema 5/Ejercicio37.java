/** Ejercicio 37 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio37 {
  public static void main(String[] args) {
    
    long num,temp,volteado,temp2;
    volteado = 0;
    
    System.out.print("Introduce un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    temp = num;
    while (temp > 0) {
      
      while (num > 0) {
        
        volteado = (volteado*10) + (num % 10);
        num /= 10;
      }
      
      temp2 = volteado % 10;
      
      for (int i = 0; temp2 > i; i++) {
        
        System.out.print("| ");
      }
    
      System.out.print("- "); 
      volteado = volteado / 10;
      temp = temp / 10;
      
    }
  }
}

