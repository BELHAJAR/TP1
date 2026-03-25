package partie4;
import java.util.Scanner;
public class EX11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Entrer une chaîne : ");
        String a = sc.nextLine();
        System.out.println("La longueur est : " + a.length());
        sc.close();
	}

}
