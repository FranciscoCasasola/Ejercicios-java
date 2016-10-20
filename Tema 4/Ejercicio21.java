/** Ejercicio 21 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio21 {
  public static void main(String[] args) {
    
    double nota1, nota2;
    double media;
    String recup;
    
    System.out.print("Introduce la nota del primer examen: ");
    
    nota1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la nota del segundo examen: ");
    
    nota2 = Integer.parseInt(System.console().readLine());
    
    media = ((nota1+nota2)/ 2);
    
    if ( media >= 5 ) {
      
      System.out.println("Has aprobado, tu media es de: " + media);
      
    } else {
      
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto) ");
      
      recup = System.console().readLine().toLowerCase();
      
      if ( recup.equals("apto")) {
        
        System.out.println("Has aprobado tu nota de media es de " + 5);
        
      } else {
        
        System.out.println("Tu nota media es de " + media);
      }
    }
  }
}
      
    
    
