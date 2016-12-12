/** Ejercicio 12 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio12 {
  public static void main (String[] args) {
  
    int [] nums = new int [10];
    Scanner s = new Scanner(System.in);
    int posInicial, posFinal;
    int aux, aux2;
 
    System.out.println("Introduzca 10 números de uno en uno: ");
    
    for (int i = 0; i < 10; i++) {
      
      nums[i] = s.nextInt();
    }
    
    //Mostrar array original
    
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("┊%-3d ", i);
    }
    System.out.println("┊");
    for (int i = 0; i < 50; i++) {
      
      System.out.printf("─");
    }
    System.out.println();
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("┊%-3d ", nums[i]);
    }
    System.out.println("┊");   
    
    System.out.println();
    
    System.out.print("Introduce la posición incial y la final: ");
    posInicial = s.nextInt();
    posFinal = s.nextInt();
    
    aux = nums[9];
    aux2 = nums[posInicial];
    for (int i = posInicial; i > 0; i--) {
      
      nums[i] = nums[i-1];
    
    }
    
    for (int i = 9; i > posFinal; i--) {
      
      nums[i] = nums [i-1];
    }
    
    nums[posFinal] = aux2;
    nums[0] = aux;
    
    //Muestra el array ya modificado
    
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("┊%-3d ", i);
    }
    System.out.println("┊");
    for (int i = 0; i < 50; i++) {
      
      System.out.printf("─");
    }
    System.out.println();
    for (int i = 0; i < 10; i++) {
      
      System.out.printf("┊%-3d ", nums[i]);
    }
    System.out.println("┊");   
    
    
    
    
    
  }
}
