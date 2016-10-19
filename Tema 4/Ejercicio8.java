/** Ejercicio 8
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio8 {
  public static void main(String[] args) {
    
    double a,b,c;
    double resultado;
    String notaFinal = "Suficiente";
    
    System.out.print("Introduzca la primera nota: ");
    
    a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota");
    
    b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la tercera nota");
    
    c = Double.parseDouble(System.console().readLine());

    
    resultado = ((a+b+c)/3);
    
    System.out.println("La media de la notas es " + resultado );
    
    if (resultado >= 0 && resultado < 5) {
      
      notaFinal = "Insuficiente";
      
    } else if ( resultado >= 5 && resultado < 6) {
      
      notaFinal = "Suficiente";
      
    } else if (resultado >= 6 && resultado < 7) {
      
      notaFinal = "Bien";
      
    } else if (resultado >= 7 && resultado < 9) {
      
      notaFinal = "Notable";
      
    } else if (resultado >= 9 && resultado <= 10) {
      
      notaFinal = "Sobresaliente";
    } else {
      
      System.out.println("Las notas estan mal escritas");
      
    }
    
    System.out.println("La nota del boletín es " + notaFinal );
  }
}









