/** Ejercicio 43 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio43 {
  public static void main(String[] args) {
  
    long num,pos,longitud,i,temp,parteIzquierda,parteDerecha;
    longitud = 0;
    
    System.out.print("Introduce un número entero positivo: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la posición para insertar el número: ");
    pos = Integer.parseInt(System.console().readLine());
    
    temp = num;
    
    while (temp > 0) {
      
      temp = temp / 10;
      longitud++;
      
    }
      
    i = longitud - pos;  
    
    parteIzquierda = num / (long)(Math.pow(10, i));
    parteDerecha = num % (long)(Math.pow(10,i));
    
    System.out.println("El número esta divido en " + parteIzquierda + " y " + parteDerecha);
    
  }
}
