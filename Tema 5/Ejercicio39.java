/** Ejercicio 39 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio39 {
  public static void main(String[] args) {
    
    int num,temp,temp2,i,temp3;
    
    System.out.print("Introduce un numero para ver sus factoriales: ");
    num = Integer.parseInt(System.console().readLine());
    
    
    temp = 1;
    for (int j = 1; num >= j; j++) {
      
      temp2 = 1;
      temp3 = 1;
      for (i = 0; j > i; i++) {
        
        temp2 = temp2 * temp3;
        temp3++;
        
      }
      
      System.out.println(i + "! = " + temp2);
      
    }
  }
}
    
