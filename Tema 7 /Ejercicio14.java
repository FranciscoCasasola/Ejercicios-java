/** Ejercicio 14 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Ejercicio14 {
  public static void main (String[] args) {
  
    
    Scanner s = new Scanner(System.in);
    boolean color;
    
    String [] palabras = new String [8];
    String [] colores = new String [9];
    String [] aux = new String [8];
    int x = 0;
    
    colores [0] = "verde";
    colores [1] = "rojo";
    colores [2] = "azul";
    colores [3] = "amarillo";
    colores [4] = "naranja";
    colores [5] = "rosa";
    colores [6] = "negro";
    colores [7] = "blanco";
    colores [8] = "morado";
    
    System.out.print("Introduzca 8 palabras a continuación: ");
    
    for (int i = 0; i < 8; i++) {
      
      palabras[i] = s.nextLine();
    }
    
    //Muestra el array al principio
    
    System.out.println("Estas son sus palabras");
    
    for (int i = 0; i < 8; i++) {
      
      System.out.printf("┊%-6d ", i);
    }
    System.out.println("┊");
    for (int i = 0; i < 40; i++) {
      
      System.out.printf("─");
    }
    System.out.println();
    for (int i = 0; i < 8; i++) {
      
      System.out.printf("┊%-6s ", palabras[i]);
    }
    System.out.println("┊");   
    
    System.out.println();
    
    for (int i = 0; i < 8; i++) {
      
      for (int j = 0; j < 9; j++) {
        
        if (palabras[i].equals(colores[j])) {
          
          aux [x] = palabras[i];
          x++;
        }
      }
    }
    
    for (int i = 0; i < 8; i++) {
      color = false;
      
      for (int j = 0; j < 9; j++) {
        
        if (palabras[i].equals(colores[j])) {
          
          color = true;
        }
        
      }
      
      if (color != true) {
        
        aux [x] = palabras[i];
        x++;
      }
    }
    //Muestra el resultado
    
    System.out.println("Estas son tus palabras ordenadas");
    
    for (int i = 0; i < 8; i++) {
      
      System.out.printf("┊%-6d ", i);
    }
    System.out.println("┊");
    for (int i = 0; i < 40; i++) {
      
      System.out.printf("─");
    }
    System.out.println();
    for (int i = 0; i < 8; i++) {
      
      System.out.printf("┊%-6s ", aux[i]);
    }
    System.out.println("┊");   
    
    System.out.println();
        
    }
    
  }
