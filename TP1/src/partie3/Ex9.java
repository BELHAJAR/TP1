package partie3;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] T = new int[3][3];
        int somme = 0;

        System.out.println("Entrer les éléments de la matrice 3x3 :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                T[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somme += T[i][j];
            }
        }
        System.out.println("La somme des éléments est : " + somme);
        sc.close();
	}

}
