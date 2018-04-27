import java.util.Scanner;

public class Repe05 {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    int d = -1;
    do {
      menu();
      d = reader.nextInt();
      switch (d) {
              case 0:  System.out.print("Bye");
                       // System.exit(0);
                       break;
              case 1:  
                    System.out.print("Ingrese a y b:");
                    int a = reader.nextInt();
                    int b = reader.nextInt();
                    System.out.println("Suma es:" +suma(a,b));
                      
                       break;
              case 2:  
                      System.out.println("Resta es:");
                       break;
              default: System.out.println("Opcion no valido");
                       break;
      }
      System.out.println("Selecciono="+d);
    } while (d!=0);
  }

  public static void menu(){
    /* Menu
      0: salir
      1: Sumar
      2: Restar
    */
      System.out.print("\nElija Menu:\n");
      System.out.println("0: salir");
      System.out.println("1: sumar");
      System.out.println("2: restar");
  }
  public static int suma(int a, int b){
    return a+b;
  }

}
