import java.util.Scanner;
public class SucessorAntecessor {
	public static void main (String[] args) {
		int n1,a1,s1;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um valor");
		n1 = in.nextInt();
		a1= n1-1; 
		s1= n1+1;
		System.out.println(" O antecessor de " + n1 + " é " + a1 + " e o sucessor é " + s1);
		in.close();
	}
}
