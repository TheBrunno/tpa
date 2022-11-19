import java.util.Scanner;

public class MaiorMenor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int a[] = new int[SIZE];
		int maior = 0, menor = 0;
		
		for(int i=0;i<SIZE;i++) {
			System.out.print("Digite o "+(i+1)+"º numero: ");
			a[i] = in.nextInt();
		}
		
		for(int i=0;i<SIZE;i++) {
			if(a[i]>maior) {
				maior = a[i];
			}
			if(a[i]<menor || i==0) {
				menor = a[i];
			}
		}
		System.out.println("O maior numero digitado é: "+maior);
		System.out.println("O menor numero digitado é: "+menor);
		
		in.close();
	}
}
