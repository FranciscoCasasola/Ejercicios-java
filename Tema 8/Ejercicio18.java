/** Ejercicio 18 Tema 8
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    long decimal,binario;
    
    binario = 1;
    
    System.out.print("Introduzca un número: ");
    decimal = s.nextInt();
    
    for (int i = 10; i >= 0; i--) {
      
      if (decimal >= matematica.Variado.potencia(2 , i)) {
        
        binario = matematica.Variado.pegaPorDetras(binario, 1);
        decimal = decimal - matematica.Variado.potencia(2, i);
        
        
      } else  {
        
        binario = matematica.Variado.pegaPorDetras(binario, 0);
        
      }
      
      
    }
    
    binario = matematica.Variado.quitaPorDelante(binario, 1);
    System.out.println("Este es el número en binario: " + binario);
    
    
      }
      
    }
