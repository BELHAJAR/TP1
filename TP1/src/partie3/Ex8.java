package partie3;

import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] tab = new int[3][3];

        System.out.println("Entrer les éléments de la matrice  :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                tab[i][j] = sc.nextInt();
            }
        }
        System.out.println("La matrice est :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
	}

}
