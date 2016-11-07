/** Ejercicio 24 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio24 {
  public static void main(String[] args) {
    
    int num,filas,temp,altura;
    num = 0;
    altura = 1;
    int altura2 = 1;
    
    
    System.out.print("Introduce el número de filas para la pirámide: ");
    filas = Integer.parseInt(System.console().readLine());
    
    int espacios = filas - 1;
    
    while (altura < filas) {
      
      num = 0;
      
      for (int i = 0; i < espacios; i++) {
        
        System.out.print(" ");
      }
      
      for (int i = 0; i < altura2; i++) {
        
        num++;
        System.out.print(num);
      }
      
      for (int i = 1; i < altura2; i++) {
        
        num--;
        System.out.print(num);
      }
      altura++;
      altura2++;
      espacios--;
      System.out.println();
    }
  }
}
    

      
