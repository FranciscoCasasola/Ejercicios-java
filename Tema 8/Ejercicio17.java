/** Ejercicio 17 Tema 8
 *
 *
 * @author Francisco Casasola Cano
 */
 public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    long binario;
    long decimal = 0;
    
    System.out.print("Introduce un número: ");
    binario = s.nextInt();
    
    int aux = matematica.Variado.digitos(binario);
    
    for (int i = 0; i < aux; i++) {
      
      decimal = decimal + (matematica.Variado.digitoN(binario, aux - i - 1) * matematica.Variado.potencia(2, i));
      
    } 
    
    System.out.println("Este es el número convertido a decimal: " + decimal);
    
      }
      
    }
