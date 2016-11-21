/** Ejercicio 6 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
  
    
    int num,numIntroducido;
    
    num = (int)(Math.random()*101);
    
    System.out.println("Juego: Adivine el número");
    
    for (int i = 4; i >= 0; i--) {
      
      System.out.print("Introduzca un número: ");
      numIntroducido = Integer.parseInt(System.console().readLine());
      
      
      if (numIntroducido == num) {
        
        System.out.println("Enhorabuena ha acertado!");
        i = 0;
      } else if ( numIntroducido > num) {
        
        System.out.println("El número introducido es mayor");
        System.out.println("Te quedan " + i + " intentos");
      } else if (numIntroducido < num) {
        
        System.out.println("El número introducido es menor");
        System.out.println("Te quedan " + i + " intentos");
        
      }
      
      
    }
  }
}
        
