import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		int maior = 0, meio = 0, menor = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o valor A: ");
		int a = in.nextInt();
		System.out.print("Digite o valor B: ");
		int b = in.nextInt();
		System.out.print("Digite o valor C: ");
		int c = in.nextInt();
		if(a>b && a>c) {
			maior = a;
		}else if(a<b && a<c) {
			menor = a;
		}else {
			meio = a;
		}
		
		if(b>a && b>c) {
			maior = b;
		}else if(b<a && b<c) {
			menor = b;
		}else {
			meio = b;
		}
		
		if(c>a && c>b) {
			maior = c;
		}else if(c<a && c<b) {
			menor = c;
		}else {
			meio = c;
		}
		System.out.println("O menor numero e: "+menor+" O numero do meio e: "+meio+" E o maior numero e: "+maior);
		in.close();
	}
}
