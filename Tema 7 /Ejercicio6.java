/** Ejercicio 6 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
  
    int [] x = new int [15];
    
    System.out.print("Introduce 15 números de uno en uno: ");
    
    for (int i = 0; i < 15; i++) {
      
      x[i] = Integer.parseInt(System.console().readLine());
    }
    
    //Mostrar array original
    
    for (int i = 0; i < 15; i++) {
      
      System.out.printf("┊%-3d ", i);
    }
    System.out.println("┊");
    for (int i = 0; i < 75; i++) {
      
      System.out.printf("─");
    }
    System.out.println();
    for (int i = 0; i < 15; i++) {
      
      System.out.printf("┊%-3d ", x[i]);
    }
    System.out.println("┊");   
    
    System.out.println();
    
    //Asignamos a la posicion i el valor anterior (i-1)
    
    int aux = x[14];
    for (int i = 14; i > 0; i--) {
        
        x[i] = x[i-1];
      }
    x[0] = aux;
    
    
    //Mostramos el segundo array con los valores cambiados
    
    for (int i = 0; i <= 14; i++) {
      
      System.out.printf("┊%-3d ", i);
    }
    System.out.println("┊");
    
    for (int i = 0; i < 75; i ++) {
      
      System.out.printf("┈");
    }
    System.out.println();
    
    for (int i = 0; i <= 14; i++) {
      
      System.out.printf("┊%-3d ", x[i]);
    }
    
    System.out.println("┊");
  }
}
