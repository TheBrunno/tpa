import java.util.Scanner;

public class DobroeTriplo {
	public static void main(String[] args) {
		int v1, dobro, triplo;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		v1 = in.nextInt();
		dobro = v1*2;
		triplo = v1*3;
		System.out.print("O número: "+v1+"    /    O dobro: "+dobro+"    /    O triplo: "+triplo);
		in.close();
	}
}
