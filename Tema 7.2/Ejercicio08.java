/** Ejercicio 08 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    String [][] ajedrez = new String [8][8];
    String posicion;
    int i = 1;
    
    System.out.println("");
    
    System.out.println("Introduzca la posición del alfil: ");
    posicion = s.next();
    
    //Convierte el string dado por el usuario en dos enteros con los que podremos trabajar en el array.
    
    int filaAlfil = posicion.charAt(1)-48;
    int columnaAlfil = (int)(posicion.charAt(0))-97;
    
    for (int n = filaAlfil; n < 8; n++) {
      
      for (int m = 0; m < 8; m++) {
        
        if ((n == filaAlfil+i) && (m == columnaAlfil - i)) {
          
          char c = (char)(m+97);
          System.out.print((c) + "" + (n) + " ");
          i++;
        }
      }
    }
    
    i = 1;
    for (int n = filaAlfil; n < 8; n++) {
      
      for (int m = 0; m < 8; m++) {
        
        if ((n == filaAlfil+i) && (m == columnaAlfil + i)) {
          
          char c = (char)(m+97);
          System.out.print((c) + "" + (n) + " ");
          i++;
        }
      }
    }
    
    i = 1;
    for (int n = filaAlfil; n >= 0; n--) {
      
      for (int m = 0; m < 8; m++) {
        
        if ((n == filaAlfil-i) && (m == columnaAlfil - i)) {
          
          char c = (char)(m+97);
          System.out.print((c) + "" + (n) + " ");
          i++;
        }
      }
    }
    
    i = 1;
    for (int n = filaAlfil; n >= 0; n--) {
      
      for (int m = 0; m < 8; m++) {
        
        if ((n == filaAlfil-i) && (m == columnaAlfil + i)) {
          
          char c = (char)(m+97);
          System.out.print((c) + "" + (n) + " ");
          i++;
        }
      }
    }
    
  }
}
