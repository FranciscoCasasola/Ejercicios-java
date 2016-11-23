/** Ejercicio 10 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio10 {
  public static void main(String[] args) {
  
      int num,contador,contadorAleatorio;
      String caracter = "a";
      contador = 10;
      
      while (contador > 0) {
        
        num = (int)(Math.random()*6);
        
        switch (num) {
          
          case 0:
            
            caracter = "*";
            break;
            
          case 1:
          
            caracter = "-";
            break;
            
          case 2:
          
            caracter = "=";
            break;
          
          case 3:
          
            caracter = ".";
            break;
      
          case 4:
          
            caracter = "|";
            break;
            
          case 5:
          
            caracter = "@";
            break;
            
          }
          
          
        contadorAleatorio = (int)((Math.random()*41)+1);
        
        for (int i = 0; i < contadorAleatorio; i++) {
          
          System.out.print(caracter);
          
        }
        System.out.println();
        contador--;
      }
    }
  }
          
      
