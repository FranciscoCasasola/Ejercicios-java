/** Ejercicio 16 Tema 4 
 *
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {
    
    String a;
    
    int contador;
    
    contador = 0;
    
    System.out.println("Test de infidelidad");
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.println("Escriba verdadero o falso");
    
    a = System.console().readLine().toUpperCase();
    
    
    
    if ( a.equals("VERDADERO") ) {
      
      contador = contador + 3;
    }
    
    
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
      
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    
    
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("Verdadero o Falso");
    
    a = System.console().readLine().toUpperCase();  
    
    
    if ( a.equals("VERDADERO")) {
      
    contador = contador+3;
    
    }
    
    if ( contador >= 0 && contador <= 10) {
      
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if (contador >= 11 && contador <= 21) {
      
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      
    }
    
    if (contador >= 22 && contador <= 30) {
      
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      
    }
    
  }
}
    
    
    
    
