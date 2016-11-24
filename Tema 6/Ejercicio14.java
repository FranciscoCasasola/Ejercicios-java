/** Ejercicio 14 Tema 6
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio14 {
  public static void main(String[] args) {
  
    int num,maximo,minimo;
    String diferencia,contestacion;
    maximo = 101;
    minimo = 0;
    
    
    
    for (int i = 0; i < 5; i++) {
      
      num = (int)(Math.random()*(maximo - minimo)+minimo);
      
      System.out.println("Es este su número? " + num);
      contestacion = System.console().readLine();
      
      if (contestacion.equals("si")) {
        
        i = 6;
        System.out.println("He conseguido acertar el número");
        
      } else {
      
      System.out.print("Tu número es mayor o menor? ");
      contestacion = System.console().readLine();
      
      if (contestacion.equals("mayor")) {
        
        minimo = num;
        
      } else if (contestacion.equals("menor")) {
        
        maximo = num;
      } else {
        
        System.out.print("No ha introducido bien la contestación");
        
      }
      if ( i == 4) {
        System.out.println("No he conseguido acertar el numero");
      }
    }
  }
}
}
      
