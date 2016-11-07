/** Ejercicio 22 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio22 {
  public static void main(String[] args) {
    
    
    int contador, contador2;
    contador = 2;
    boolean primo;
    
    while (contador < 100) {
      
      primo = true;
      
      contador2 = (contador-1);
      
      while (contador2 != 1) {
        
        if ((contador % contador2) == 0) {
          
          primo = false;
        } 
        contador2--;
      }
      
      if (primo == true) {
        
        System.out.println(contador);
      }
      
      contador++;
    }
  }
}
     
