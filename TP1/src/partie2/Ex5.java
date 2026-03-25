package partie2;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int N = sc.nextInt();
        int[] tableau = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = sc.nextInt();
        }
        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < N; i++) {
            System.out.println(tableau[i]);
        }
        sc.close();
    

	}

}
