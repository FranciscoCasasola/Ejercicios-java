/** Ejercicio 5 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio05 {
  public static void main(String[] args) {
    
      System.out.print("50 números aleatorios: ");

      int num,mayor,acumulado,menor,contador;
      menor = 300;
      mayor = 0;
      acumulado = 0;
      contador = 0;
      
      num = (int)((Math.random()*100)+100);
      
      for (int i = 0; i < 50; i++) {
        
        num = (int)((Math.random()*100)+100);
        acumulado = acumulado + num;
        
        System.out.print(num + " ");
        
        if (num > mayor) {
          
          mayor = num;
          
        }
        
        
        if (num < menor) {
          
          menor = num;
          
        }
        
        
        contador++;
      }
      
      System.out.println("\nLa media es de " + acumulado/2);
      System.out.println("El mayor es " + mayor);
      System.out.println("El menor es " + menor);
    }
  }
        
