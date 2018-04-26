import java.util.Scanner;

public class Repe04 {
  public static void main(String[] args) {

    /* Menu
      0: salir
      1: Sumar
      2: Restar
    */
    Scanner reader = new Scanner(System.in);
    

    System.out.print("Elija Menu:\n");
    System.out.println("0: salir");
    System.out.println("1: sumar");
    System.out.println("2: restar");

    String d = reader.nextLine();
    do {
    System.out.print("Elija Menu:\n");
    System.out.println("0: salir");
    System.out.println("1: sumar");
    System.out.println("2: restar");
    d = reader.nextLine();
    switch (d) {
            case "0":  System.out.print("Bye");
                      System.exit(0);
                     break;
            case "1":  System.out.print("Suma es:");
                     break;
            case "2":  System.out.print("Resta es:");
                     break;
            
            default: System.out.print("Opcion no valido");
                     break;
        }
    System.out.print("Selecciono="+d);
  } while (true);
  }
  }
