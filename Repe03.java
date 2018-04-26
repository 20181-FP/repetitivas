import java.util.Scanner;

public class Repe03 {
  public static void main(String[] args) {

    //5!=1x2x3x4x5
    Scanner reader = new Scanner(System.in);
    System.out.print("n:");
    double n = Double.parseDouble( reader.nextLine() );
    double fac=1;
    int i=1;
    do {
      fac = fac*i;
      i++;
    } while (i<=n);
    System.out.print("n!="+fac);
  }
  }