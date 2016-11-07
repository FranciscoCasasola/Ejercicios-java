/** Ejercicio 19 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio19 {
  public static void main(String[] args) {
      
    int altura,altura2;
    String s;
    int espacios;    
    System.out.print("Introduce la altura de la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el carácter para pintar la pirámide: ");
    s = System.console().readLine();
    altura2 = 1;
    
    espacios = altura-1;
    
    while (altura > 0) {
      // Inserta los espacios para la piramide
      for (int i = 0; i < espacios; i++) {
        
        System.out.print(" ");
        
      }
      // pinta la piramide linea a linea
      for (int i = 0; i < altura2; i++) {
        
        System.out.print(s);
      }
      System.out.println();
      altura2 = altura2 + 2;
      altura--;
      espacios--;
    }
  }
}
      
