/** Ejercicio 9
 *
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio9 {
  public static void main(String[] args) { 
    
    
    double a,b,c;
    double x,x2;
    double interiorRaiz,b2,raiz;
    
    System.out.println("Introduce las variables a,b y c para calcular la ecuacion 'ax²+bx+c' ");
    
    System.out.print("Introduce la variable a : ");
    
    a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la variable b: ");
    
    b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la variable c: ");
    
    c = Double.parseDouble(System.console().readLine());
    
    
    b2 = b*b;
    
    interiorRaiz = (b2) - (4*a*c);
    raiz = Math.sqrt(interiorRaiz);
    
    
    if ( a == 0 && b == 0 && c == 0) {
      
      System.out.println("La ecuación tiene infinitas soluciones");
      
    } else if ( a == 0 && b != 0 && c != 0) {
      
      System.out.println(" La solución es " + ((-c)/b));
      
    } else if ( a == 0 && b == 0 && c != 0) {
      
      System.out.println("La solución es " + c);
      
    } else if ( c == 0 ) {
      
      System.out.println("La solución es " + ((-b)/a));
      
    } else if (interiorRaiz > 0) {
    
      System.out.println("X1 es igual a " + (((-b) + (raiz)) / (2*a)));
      System.out.println("X2 es igual a " + (((-b) - (raiz)) / (2*a)));
    
    } else {
    
      System.out.println("No tiene solucion");
    
   } 
  }
  
}
    
    
    
    
