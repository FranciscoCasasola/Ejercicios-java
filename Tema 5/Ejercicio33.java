/** Ejercicio 33 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio33 {
  public static void main(String[] args) {
  
    int altura;
    String s;
    s = "*";
    
    System.out.print("Introduzca la altura de la letra 'U': ");
    altura = Integer.parseInt(System.console().readLine());
    
    for ( int i = 0; i < altura; i++) {
      
      System.out.println(s + "   " + s);
      
    }
    
    System.out.println(" " + "***" + " ");
  }
}
