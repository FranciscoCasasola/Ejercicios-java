/** Ejercicio 13 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int num;
    int contador, contarNegativos, contarPositivos,contarCeros;
    contarPositivos = 0;
    contarNegativos = 0;
    contarCeros = 0;
    contador = 10;
    
    while ( contador > 0) {
      
      System.out.print("Introduzca 10 números (de uno en uno): ");
      num = Integer.parseInt(System.console().readLine());
      
      if (num > 0) {
        
        contarPositivos++;
        
      } else if ( num < 0 ) {
        
        contarNegativos++;
        
      } else { 
        
        contarCeros++;
        
      }
      
      contador--;
    }
      System.out.println("Hay " + contarPositivos + " números positivos");
      System.out.println("Hay " + contarNegativos + " números negativos");
      System.out.println("Hay " + contarCeros + " ceros ");
  }
}
      
