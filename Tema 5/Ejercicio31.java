/** Ejercicio 31 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio31 {
  public static void main(String[] args) {
  
    int altura,temp;
    String s;
    s = "*";
    
    System.out.print("Introduzca la altura de la letra 'L': ");
    altura = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i < altura; i++) {
      
      System.out.println(s);
      
    }
    
    altura = altura/2;
    
    for (int i = 0; i <= altura; i++) {
      
      System.out.print(s + " ");
      
    }
  }
}
      
      
      
  
    
