/** Ejercicio 12 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
    
    int contador;
    int num,temp,temp2;
    
    System.out.print("Introduzca 'n' primeros numeros que quiera ver de la serie de fibonacci: ");
    contador = Integer.parseInt(System.console().readLine());
    
    num = 1;
    temp = 1;
    temp2 = 1;
    
    while (contador > 0) {
      
      
      temp = temp2;
      
      System.out.println("Serie de fibonacci " + temp2);
      
      temp2 = num + temp2;
      
      num = temp;
      
      contador--;
    }
  }
}
