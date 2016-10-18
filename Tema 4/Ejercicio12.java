/** Ejercicio 12
 *
 *
 * @author Francisco Casasola Cano
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    
   
    
    String a;
    int contador;
    
    contador = 0;
    
    System.out.println("Examen tipo Test");
    System.out.println("1. ¿Cual de los siguientes tipos de datos permite almacenar un número (con decimales) con mas precisión");
    System.out.println("A. Int    B.Double    C.Float");
    
    a = System.console().readLine().toUpperCase();
    
    
    
    if ( a.equals("B") ) {
      
      contador++;
    }
    
    
    System.out.println("2. ¿Con que comando se crea un archivo de texto en linux?");
    System.out.println("A. cp     B. mv     C. touch");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("C")) {
      
    contador = contador+1;
    
    }
      
    System.out.println("3. ¿Cual de los siguientes códigos esta mal escrito?");
    System.out.println("A. int a = 2;     B. int a;     C. int a = 0:");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("C")) {
      
      contador = contador+1;
    }
    
    System.out.println("4. ¿En que asignaturas usamos el programa 'Geany'?");
    System.out.println("A. Programación     B. Fol      C. Sistemas inf.");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("A")) {
      
      contador = contador+1;
      
    }
    
    System.out.println("5. ¿Que lenguaje usamos en programación? ");
    System.out.println("A. Java     B. C++     C. Python");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("A")) {
      
      contador = contador+1;
      
    }
     
    System.out.println("6. Pregunta");
    System.out.println("A.     B.      C. ");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("A")) {
      
      contador = contador+1;
      
    }  
      
    System.out.println("7. Pregunta");
    System.out.println("A.     B.      C. ");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("A")) {
      
      contador = contador+1;
      
    }
    
    System.out.println("8. Pregunta");
    System.out.println("A.     B.      C. ");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("A")) {
      
      contador = contador+1;
      
    }
    
    System.out.println("9. Pregunta");
    System.out.println("A.     B.      C. ");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("A")) {
      
      contador = contador+1;
      
    }
    
    System.out.println("10. Pregunta");
    System.out.println("A.     B.      C. ");
    
    a = System.console().readLine().toUpperCase();
    
    
    if ( a.equals("A")) {
      
      contador = contador+1;
      
    }
    
    System.out.println(" Su calificación es de " + contador + " puntos");
    
  }
}
    
    
