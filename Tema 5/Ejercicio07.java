/** Ejercicio 07 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio07 {
  public static void main(String[] args) {
    
    
    int num;
    int intentos;
    intentos = 1;
    
    while (intentos <= 4) {
      
      System.out.print("Introduzca un número de 4 dígitos: ");
      
      num = Integer.parseInt(System.console().readLine());
      
      if (num == 4582) {
        
        System.out.println("Enhorabuena, ha introducido la contraseña correctamente");
        
        intentos = 5;
        
      } else if (intentos < 4) {
        
        System.out.println("Has fallado vuelve a intentarlo");
        
      } else {
        
        System.out.println("Te has quedado sin intentos");
      }
      intentos++;
    }
      
  }
}
