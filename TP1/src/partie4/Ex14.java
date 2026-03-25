package partie4;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Entrer une chaîne : ");
        String texte = sc.nextLine();
        boolean palin = true;
        int n = texte.length();
        for (int i = 0; i < n / 2; i++) {
            if (texte.charAt(i) != texte.charAt(n - 1 - i)) {
                palin = false;
                break;
            }
        }
        if (palin) {
            System.out.println("La chaîne est un palindrome.");
        } else {
            System.out.println("La chaîne n'est pas un palindrome.");
        }
        sc.close();

	}

}
