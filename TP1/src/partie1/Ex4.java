package partie1;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre N : ");
        int N = sc.nextInt();
        int i = 1;
        int somme = 0;
        while (i <= N) {
            somme = somme + i;
            i++;
        }
        System.out.println("La somme des " + N + " premiers entiers est : " + somme);
        sc.close();
	}

}
