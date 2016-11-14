/** Ejercicio 35 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio35 {
  public static void main(String[] args) {
      
      
      long altura,espacio,espacioInterior;
      espacio = 0;
      String s;
      s = "*";
      
      
      System.out.print("Introduzca la altura de la 'X': ");
      altura = Integer.parseInt(System.console().readLine());
      if ( altura <= 2) {
        System.out.print("Introduce un número que sea impar y mayor o igual que 3");
      } else {
      espacioInterior = altura - 2;
      
      for (int i = 0; altura > i; i++) {
        
        
        if (i < altura/2) {
        
        for (int j = 1; espacio >= j; j++) {
          
          System.out.print(" ");
        }
        espacio++;
        System.out.print(s);
        for (int j = 0; espacioInterior > j; j++) {
          
          System.out.print(" ");
          
        }
        espacioInterior = espacioInterior -2;
        System.out.print(s);
        
        } else if (i > altura/2) {
        
          
        for (int j = 0; espacio > j; j++) {
          
          System.out.print(" ");
        }
        espacio--;
        System.out.print(s);
        
        for (int j = 0; espacioInterior > j; j++) {
          
          System.out.print(" ");
          
        }
        espacioInterior = espacioInterior + 2;
        System.out.print(s);
        } else if (i == altura/2) {
          for (int j = 1; espacio >= j; j++) {
          
          System.out.print(" ");
        }
          System.out.print(s);
          espacio--;
          espacioInterior = espacioInterior + 2;
          
        }
          
        System.out.println();
      }
      }
    }
  }
      
          
          
          
          
          
        
        
        
        
