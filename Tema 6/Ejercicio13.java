/** Ejercicio 13 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio13 {
  public static void main(String[] args) {
  
    int dado,dado2;
    int tiradas = 0;
    
    do {
      
      dado = (int)((Math.random()*6)+1);
      dado2 = (int)((Math.random()*6)+1);
      tiradas++;
      
      
    }while (dado != dado2);
      
      System.out.println("Los dados tienen el mismo valor en " + tiradas + " tiradas");
    
  }
}

