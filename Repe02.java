import java.util.Scanner;

public class Repe02 {
	public static void main(String[] args) {

		//5!=1x2x3x4x5
		Scanner reader = new Scanner(System.in);
		System.out.print("n:");
		double n = Double.parseDouble( reader.nextLine() );
		double fac=1;
		int i=1;
		while (i<=n) {
			fac = fac*i;
			i++;
		}
		System.out.print("n!="+fac);
	}
	}