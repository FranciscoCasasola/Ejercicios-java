/** Ejercicio 09 Tema 7
 *
 *
 * @author Francisco Casasola Cano
 */
 
public class Ejercicio09 {
  public static void main(String[] args) {
  
    
    int [][] matriz = new int [12][12];
    int contador,capa;
    int aux1,aux2,aux3;
    contador = 0;
    
    for (int i = 0; i < 12; i++) {
      
      for (int j = 0; j < 12; j++) {
        
        matriz[i][j] = (int)(Math.random()*101);
      }
    }
    
    for (int i = 0; i < 12; i++) {
      
      for (int j = 0; j < 12; j++) {
        
        System.out.printf("%3d", matriz[i][j]);
      }
      System.out.println();
      
    }
    
    //Rotación del array
      
    for (capa = 0; capa < 6; capa++) {
      
      //Capa superior
      
      aux1 = matriz[capa][11-capa];
      for (int i = 11-capa; i > capa; i--) {
        
        matriz[capa][i] = matriz[capa][i-1];
      }
      
      //Capa lateral derecha
      
      aux2 = matriz[11-capa][11-capa];
      for (int i = 11-capa; i > capa; i--) {
        
        matriz[i][11-capa] = matriz[i-1][11-capa];
      }
      matriz[capa+1][11-capa] = aux1;
      
      //Capa inferior
      
      aux3 = matriz[11-capa][capa];
      for (int i = 11-capa; i > capa + 1; i--) {
        
        matriz[11-capa][11-i] = matriz[11-capa][12-i];
      }
      matriz[11-capa][10-capa] = aux2;
      
      //Capa lateral izquierda
      
      for (int i = capa; i < 11; i++) {
        
        matriz[i][capa] = matriz[i+1][capa];
      }
      matriz[10-capa][capa] = aux3;
    }
    
    System.out.println();
    
    for (int i = 0; i < 12; i++) {
      
      for (int j = 0; j < 12; j++) {
        
        System.out.printf("%3d", matriz[i][j]);
      }
      System.out.println();
    }
    
    System.out.println();
  }
}
