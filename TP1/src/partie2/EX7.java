package partie2;
import java.util.Scanner;
public class EX7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Donner la taille du tableau : ");
	     int N = sc.nextInt();

	     int[] t = new int[N];
	        for (int i = 0; i < N; i++) {
	            System.out.print("Entrer l'élément " + (i + 1) + " : ");
	            t[i] = sc.nextInt();
	        }
	        int max = t[0];
	        for (int i = 1; i < N; i++) {
	            if (t[i] > max) {
	                max = t[i];
	            }
	        }
	        System.out.println("Le plus grand élément est : " + max);
	     sc.close();
	}

}
