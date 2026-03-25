package partie2;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] tableau = new int[10];
        System.out.println("Entrez 10 entiers :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
           tableau[i] = sc.nextInt();
        }
        System.out.print("Entrez le nombre à rechercher : ");
        int nombre = sc.nextInt();
        boolean trouve = false;
        for (int i = 0; i < 10; i++) {
            if (tableau[i] == nombre) {
                System.out.println("Nombre trouvé à la position : " + i);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Nombre non trouvé dans le tableau.");
        }
        sc.close();
	}

}
