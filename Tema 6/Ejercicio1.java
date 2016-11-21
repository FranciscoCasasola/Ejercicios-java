/** Ejercicio 2 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio2 {
  public static void main(String[] args) { 
  
    int temp,temp2;
    temp2 = 0;
    
    System.out.println("Tiradas del dado:");
    
    for (int i = 0; i < 3; i++) {
      
    temp = (int)(Math.random()*6);
    System.out.println("Tirada del dado: " + temp);
    
    temp2 = temp2 + temp;
    
    }
    
    System.out.print("La suma de los dados es: " + temp2);
  }
}
