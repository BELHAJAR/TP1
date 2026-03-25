package partie3;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] t = new int[3][3];
        System.out.println("Entrer les éléments :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrice :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transposée :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
	}
}
