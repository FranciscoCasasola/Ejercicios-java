/** Ejercicio 24 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
  
    long num,pos,longitud,temp,alea;
    longitud = 0; 
  
    Scanner s = new Scanner(System.in);
   
    System.out.print("Introduce un número positivo: ");
    num = s.nextInt();
   
    temp = num;
  
    while (temp != 0) {
    
      temp = temp / 10;
      longitud++;
    }
    alea = (long)(Math.random()*longitud);
          
    num = (num / (long)(Math.pow(10, alea)));
    num = num % 10;
  
    System.out.print(num);
  
  }
}

  
  
