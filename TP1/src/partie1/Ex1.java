package partie1;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    if (n > 0)
        System.out.println("Positif");
        else if (n < 0)
	            System.out.println("Négatif");
        else
	            System.out.println("Nul");
	    
	    sc.close(); 
	}

}
