/** Ejercicio 20 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio20 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura de la piramide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter de la pirámide: ");
    String s = System.console().readLine();
    
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int espacios2 = 0;
    int altura2 = 1;
    
    while (altura <= alturaIntroducida) {
      // Espacios antes de la piramide
      for (int i = 0; i < espacios; i++) {
        
        System.out.print(" ");
      }
      //Pinta la pared izquierda
      System.out.print(s);
      // Pinta la base de la piramide
       if (altura == alturaIntroducida) {
        
        for (int i = 1; altura2 > i; i++) {
          
          System.out.print(s);
        }
      } else {
      //Espacios dentro de la pirámide
      for (int i = 2; i <= espacios2; i++) {
        
        System.out.print(" ");
        //Pinta la pared derecha
        if (i == espacios2) {
          System.out.print(s);
        }
        
      }
    }
      altura2 = altura2 + 2;
      System.out.println();
      altura++;
      espacios--;
      espacios2 = espacios2+2;
    }
  }
}
      
