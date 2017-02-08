/** Trabajo CRUD 2º Trimestre
 *
 *
 */
 
public class Crud {
  static String nombre[] = new String [20];
  static String descripcion[] = new String [20];
  static String precio[] = new String [20];
  static String tipo[] = new String [20];
  
  public static void main (String[] args) {
    
    for (int i = 0; i < 5; i++) {
      
      nombre[i] = "Asus-x98";
      descripcion[i] = "4gb, DDR3";
      precio[i] = "160€";
      tipo[i] = "Placa base";
    }
      
    int opcion = 1;
    int x,y;
      
    while (opcion != -1) {
    
      
    
      System.out.println("Elija una de las siguientes opciones");
      System.out.println("------------------------------------");
      System.out.println("1) Listado ");
      System.out.println("2) Borrar elementos");
      System.out.println("3) Modificar");
      System.out.println("4) Dar de alta");
    
      opcion = Integer.parseInt(System.console().readLine());
    
      switch (opcion) {
      
        case 1:
  
          listado();
          break;
        
        case 2:
        
          System.out.println("Que elemento quieres borrar? ");
          x = Integer.parseInt(System.console().readLine());
         
          borrarElemento(nombre, x);
          borrarElemento(descripcion, x);
          borrarElemento(precio, x);
          borrarElemento(tipo, x);
          break;
        
        case 3: 
        
          System.out.println("Que elemento quieres modificar? ");
          x = Integer.parseInt(System.console().readLine());
         
          modificar(nombre, x);
          modificar(descripcion, x);
          modificar(precio, x);
          modificar(tipo, x);
          break;
        
        case 4:
        
          System.out.print("Nombre: ");
          darAlta(nombre);
          System.out.print("Descripcion: ");
          darAlta(descripcion);
          System.out.print("Precio: ");
          darAlta(precio);
          System.out.print("Tipo: ");
          darAlta(tipo);
        
      }  
  }
}

  /* Función para listar por nombre los productos
   */
  public static void listado() {
    
    for (int i = 0; i < 20; i++) {
      
      System.out.printf("%-10s  %-10s  %-10s  %-10s", "Nombre", "Descripcion", "Precio", "Tipo\n");
      System.out.printf("%-10s  %-10s  %-10s  %-10s  %2s", nombre[i], descripcion[i], precio[i], tipo[i],"\n");
      
    }
  }
  /* Funcion para modificar un elemento de los arrays
   */
  public static void modificar (String a[] , int x) {
    
    System.out.print("Escriba para cambiar " + "'" + a[x] + "'");
    a[x] = System.console().readLine();
  }
  /* Funcion para borrar un elemento
   */
  
  public static void borrarElemento (String a[], int x) {
    
    a[x] = "";
  }
  
  /* Funcion para dar de alta el elemento deseado */
  
  public static void darAlta (String a[]) {
    
    for (int i = 0; i < 20; i++) {
      
      if (a[i] == "") {
        
        a[i] = System.console().readLine();
      }
    }
  }
}

