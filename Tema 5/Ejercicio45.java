/** Ejercicio 45 Tema 5
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio45 {
  public static void main(String[] args) {
    
    long num,parteIzquierda,parteDerecha,pos,digito,temp;
    long longitud,i,resultado;
    longitud = 0;
    
    System.out.print("Introduce un número: ");
    num = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la posición para insertar: ");
    pos = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el digito que quieras: ");
    digito = Integer.parseInt(System.console().readLine());
    
    temp = num;
    
     while (temp > 0) {
      
      temp = temp / 10;
      longitud++;
      
    }
    
    i = longitud - pos;
    
    parteIzquierda = (num / (long)(Math.pow(10,i)));
    parteIzquierda = (parteIzquierda/10);
    parteIzquierda = (parteIzquierda*10) + digito;
    
    parteDerecha = ( num % (long)(Math.pow(10,i)));
    
    resultado = (parteIzquierda * (long)(Math.pow(10,i))) + parteDerecha;
    
    System.out.print("Este es el nuevo número " + resultado);
  }
}
