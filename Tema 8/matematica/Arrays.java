/** Funciones de Array unidimensionales
 *
 *
 * @author Francisco Casasola Cano
 */

public class Arrays {
  
  
  /**
   * Funcion escrita para generar un array aleatorio
   * 
   * @param x Este parametro es el array introducido por el usuario
   * @param y Este parametro dicta el nº maximo dentro del array
   * @param z Este parametro es el mínimo de nº dentro del array
   */
  
  
  public static void generaArrayInt (int x[], int y, int z) {
    
    
    
    for (int i = 0; i < x.length; i++) {
      
      x[i] = (int)(Math.random()*y) + z;
      
    }
    
  }
  
  /**
   * Funcion que devuelve el minimo dentro de un array
   * @param x Este parametro es el array indicado por el usuario
   * @return <code> minimo </code> Es el minimo dentro del array
   */
  
  public static int minimoArrayInt (int x[]) {
    
    int minimo = 1000000;
   
    for (int i = 0; i < x.length; i++) {
      
      if (x[i] < minimo) {
        
        minimo = x[i];
      }
      
    }
    
    return minimo;
  }
  
  /**
   * Funcion que devuelve el maximo de un array
   * @param x Es el array indicado por el usuario
   * @return <code> maximo </code> Devuelve el nº maximo dentro del array
   */
  
  public static int maximoArrayInt (int x[]) {
    
    int maximo = 0;
    
    for (int i = 0; i < x.length; i++) {
      
      if (x[i] > maximo) {
        
        maximo = x[i];
      }
      
    }
    
    return maximo;
  }
 
  /**
   * Funcion que calcula la media dentro de un array
   * @param x Este parametros es el array indicado por el usuario
   * @return <code> media </code> Esta es la media de los numeros dentro del array
   */
  
  public static int mediaArrayInt (int x[]) {
    
    int media;
    media = 0;
    
    for (int i = 0; i < x.length; i++) {
      
      media = media + x[i];
      
    }
    
    media = media / x.length;
    
    return media;
    
  }
  /**
   * Funcion que confirma si un número esta dentro o no de un array
   * @param x Es el array dado por el usuario
   * @param y Es el número que vamos a comprobar si esta dentro
   */
  public static void estaEnArrayInt (int x[], int y) {
    
    for (int i = 0; i < x.length; i++) {
      
      if (x[i] == y) {
        
        System.out.println("El número esta dentro del array");
      } else  {
        
        System.out.println("El número no esta dentro del array");
      }
    }
  }
  /**
   * Función que busca la posicion de un número en el array
   * @param x Array que introducimos en el que buscar el numero
   * @param y Numero que buscamos en el array
   * @return <code> n </code> Posición del array donde esta el número
   */
  
  public static int posicionEnArray (int x[], int y) {
    
    int n = 0;
    
    for (int i = 0; i < x.length; i++) {
      
      if (y == x[i]) {
        
        n = x[i];
      }
    }
    
    return n;
  }
  /**
   * Función que voltea el array introducido
   * @param x Array introducido para darle la vuelta
   * @return <code> aux </code> Devuelve el array al reves
   */
  public static int[] volteaArrayInt (int x[]) {
    
    int aux[] = new int [x.length];
    int n = x.length - 1;
    
    for (int i = 0; i < x.length; i++) {
      
      aux[n] = x[i];
      n--;
    }
    
    for (int i = 0; i < x.length; i++) {
      
    }
    
    return aux;
  }
  
  public static int[] rotaDerechaArrayInt (int x[], int y) {
    
    int aux = 0;
    
    for (int i = 1; i < x.length; i++) {
      
      x[i] = x[i-1];
      
      if ( i == x.length - 1) {
        
        aux = x[i];
      }
    }
    x[0] = aux;
    
    return x;
  }
  
  public static int[] rotaIzquierdaArrayInt (int x[], int y) {
    
    int aux = 0;
    
    for (int i = 0; i < x.length; i++) {
      
      if (i == x.length - 1) {
        
        aux = x[0];
      } else {
      
      x[i] = x[i+1];
      }
    }
    x[x.length-1] = aux;
    
    return x;
  }


}
