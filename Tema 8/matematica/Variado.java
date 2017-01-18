/**
 * Biblioteca de funciones para varias operaciones sencillas
 *
 * @author Francisco Casasola Cano
 */
import java.util.Scanner;
public class Variado {
  
  
  /**
   * 
   * Funcion para comprobar número capicua
   * 
   * @param x es el número introducido por el usuario
   * @return <code>false</code> Si el número no es capicúa
   * @return <code>true</code> Si el número es capicúa
   */
  
  public static boolean esCapicua (int x) {
    
    if (x != volteado(x)) {
      
      return false;
    } else  {
    
    return true;
    }
  }
  
  /**
   * Función para comprobar si el número es primo o no
   * 
   * @param x es el número introducido por el usuario
   * @return  <code>false</code> Si el número introducido no es primo
   * @return <code>true</code> Si el número introducido es primo
   */
  
  public static boolean esPrimo (int x) {
    
    boolean n;
    
    n = true;
    
    for (int i = 2; i < (Math.sqrt(x)); i++) {
      
      if (x % i == 0) {
        
        n = false;
      }
    }
    return n;
  }
  
  /**
   * Función que nos devuelve el siguiente número primo a partir de un número
   * introducido.
   * @param x Es el número introducido
   * @return <code> x </code> Devuelve el siguiente número primo
   */
  
  public static int siguientePrimo (int x) {
    
    boolean n = false;
    
    while (n == false) {
      
      x++;
      
      if (esPrimo(x) == true) {
        n = true;
      }
    }
    return x;
  }
  /**
   * Función para voltear un número
   * 
   * @param x Es el número introducido por el usuario para voltear
   * @return <code> n </code> Es el número ya volteado
   */
  
  public static int volteado (int x) {
    int m;
    int n = 0;
    
    while (x != 0) {
      
      m = x%10;
      x = x/10;
      
      n = (10*n) + m;
    }
    return n;
  }
  
  /**
   * Función para realizar la potencia de un número
   * 
   * @param x Este número es la base de la potencia
   * @param y Este número es el expontente de la base
   * @return <code> n </code> Devuelve la potencia ya realizada
   */
  
  public static int potencia (int x,int y) {
    
    int n = 1;
    
    while (y > 0) {
      
      n = n * x;
      y--;
    }
    
    return n;
  }
  
  /**
   * Función para contar los dígitos que tiene un número
   * 
   * @param x Es el número introducido para calcular el nº de sus dígitos
   * @return <code> n </code> Es el número de dígitos que tiene introduce le usuario
   */
  
  public static int digitos (int x) {
    
    int n = 0;
    
    while (x != 0) {
      
      n++;
      x = x /10;
    }
    
    return n;
  }
  
  /**
   * Función que devuelve un dígito colocado en la posición 'y'.
   * 
   * @param x Es el número de donde extraeremos el dígito.
   * @param y Es la posición del número de donde extraeremos el dígito.
   * @return <code> x </code> Es el dígito sacado del número.
   */
  
  public static int digitoN (int x, int y) {
    
    for (int n = digitos(x); n > y; n--) {
      
      x = x / 10;
    }
    
    x = x % 10;
    
    return x;
  }
  
  /**
   * Función que devuelve la posicón de un dígito, dentro de un número.
   * 
   * @param x Es el número donde buscaremos el dígito.
   * @param y Es el dígito que buscamos
   * @return <code> n </code> Es la posición donde esta colocado el dígito dentro
   * del número
   */
  
  public static int posicionDigito (int x, int y) {
    
    int n;
    
    while (x > 0) {
      
      n = x % 10;
      
      if (n == y) {
        
        return n;
      }
    }
    
    n = -1;
    return n;
  }
  
  /**
   * Función que quita 'n' dígitos por detras, al número introducido
   * 
   * @param x Es el número al que se le descontaran los digitos
   * @param y Es el número de dígitos que hay que quitar del número
   * @return <code> x </code> Devuelve el resto del número, con los dígitos ya eliminados
   */
  
  public static int quitaPorDetras (int x, int y) {
    
    for (int i = 0; i < y; i++) {
      
      x = x / 10;
      
    }
    
    return x;
  }
  
  /**
   * Función para eliminar 'n' dígitos de un número por delante
   * 
   * @param x Es el número al cual se le descontaran los dígitos
   * @param y Es el número de digitos que se eliminaran del número
   * @return <code> numeroArreglado </code> Es el número con los digitos ya 
   * descontados.
   */
  
  public static int quitaPorDelante (int x, int y) {
    
    int m = 1;
    int numeroArreglado;
    
    for (int n = digitos(x); n > y; n--) {
      
      m = m * 10;
    }
    numeroArreglado = x % m;
    
    return numeroArreglado;
  }
 
  /**
   * Función para pegar un dígito por detrás del número
   * 
   * @param x Es el número al que le vamos a pegar el dígito 
   * @param y Es el dígito que vamos a añadir al número.
   * @return <code> x </code> Es el nuevo número creado
   */
  
  public static int pegaPorDetras (int x, int y) {
    
    x = x * 10;
    x = x + y;
    
    return x;
  }
  
  /**
   * Función para pegar un dígito a un número por delante.
   * 
   * @param x Es el número al que se le sumara el dígito
   * @param y Es el dígito que pegamos por delante del número
   * @return <code> x </code> Es el nuevo número con el dígito ya añadido
   */
  
  public static int pegaPorDelante (int x, int y) {
    
    int n = digitos(x) + 1;
    
    x = (x * n) + y;
    
    return x; 
    
  }
  
  /**
   * Función para acortar un número dada dos posiciones inicial y final.
   * @param x Es el número que acortaremos
   * @param y Es la posición inicial
   * @param z Es la posicion final
   * @return <code> nuevoNumero </code> Es el número ya acotado.
   */
  
  public static int trozoDeNumero (int x, int y, int z) {
    
    int n;
    int dig;
    int nuevoNumero;
    
    dig = digitos(x);
    
    n = dig - z;
    
    nuevoNumero = quitaPorDetras(x,n);
    nuevoNumero = quitaPorDelante(nuevoNumero,y);
    
    return nuevoNumero;
    
  }
  
  /**
   * Función para juntar dos números en uno solo
   * @param x Es el primer numero introducido para unir
   * @param y Es el segundo numero introducido para unir
   * @return <code> nuevoNumero </code> Es el nuevo número resultado de 
   * unir el primer número con el segundo.
   */
   
  public static int juntaNumeros (int x, int y) {
    
    int m = digitos(y);
    int nuevoNumero,aux;
    aux = 1;
    
    while (m > 0) {
      
      aux = aux *10;
      m--;
    }
    
    nuevoNumero = (x*aux) + y;
    
    return nuevoNumero;
    
  }
}

