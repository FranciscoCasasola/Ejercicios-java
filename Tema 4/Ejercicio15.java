/** Ejercicio 15 Tema 4
 *
 *
 * @author Francisco Casasola Cano
 */
 


public class Ejercicio15 {
  public static void main(String[] args) {
  
    
    
    String b;
    int a;
    System.out.println("Introduzca un número para elegir hacia donde quiere que mire el vertice de la piramide ");
    System.out.println("1. Mira hacia arriba ");
    System.out.println("2. Mira hacia abajo ");
    System.out.println("3. Mira hacia la derecha ");
    System.out.println("4. Mira hacia la izquierda ");
    
    a = Integer.parseInt(System.console().readLine());
    
    
    System.out.print("Introduzca un caracter, puede ser número, letra, o simbolo: ");
    
    b = System.console().readLine();
    
    
    switch (a) {
      
      case 1:
      
      System.out.println( "     " + b + " \n" + "    " + b + b + b + " \n" + "   " + b + b + b + b + b +" \n" + "  " + b + b + b + b + b + b + b + " \n" + " " + b + b + b + b + b + b + b + b + b);
      break;
      
      case 2:
      
      System.out.println( b + b + b + b + b + b + b + b + b + "\n" + " " + b + b + b + b + b + b + b + "\n" + "  " + b + b + b + b + b + "\n" + "   " + b + b + b + "\n" + "    " + b);
      break;
      
      case 3:
      
      System.out.println( b + "\n" + b + b + " \n" + b + b + b + "\n" + b + b + b + b + "\n" + b + b + b + b + b + " \n" + b + b + b + b + "\n" + b + b + b + "\n" + b + b + "\n" + b);
      break;
      
      case 4:
      
      System.out.println( "    " + b + " \n " + "  " + b + b + "\n" + "  " + b + b + b + "\n" + " " + b + b + b + b + "\n" + b + b + b + b + b + "\n" + " " + b + b + b + b + "\n" + "  " + b + b + b + "\n" + "   " + b + b + "\n" + "    " + b);
      break;
      
    }
  }
}
