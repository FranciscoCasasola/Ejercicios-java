/** Ejercicio 28 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio28 {
  public static void main(String[] args) {
  
    int num,temp,temp2;
    temp = 1;
    
    System.out.print("Introduzca un número y saldra su factorial: ");
    num = Integer.parseInt(System.console().readLine());
    temp2 = num;
    
    for (int i = 0; i < temp2; i++) {
      
      temp = temp * num;
      num--;
    }
    
    System.out.println("!" + temp2 + " = " + temp);
  }
}
