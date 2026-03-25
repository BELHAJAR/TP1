package partie4;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Entrer une chaîne : ");
	        String n = sc.nextLine();

	        String a = "";
	        for (int i = n.length() - 1; i >= 0; i--) {
	            a += n.charAt(i);
	        }
	        System.out.println("Chaîne inversée : " + a);
            sc.close();
	}

}
