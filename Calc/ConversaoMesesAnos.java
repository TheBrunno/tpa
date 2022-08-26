import java.util.Scanner;
public class ConversaoMesesAnos {
	public static void main(String[] args) {
		double nDias, qtdeMeses, qtdeAnos;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a quantidade de dias: ");
		nDias = in.nextInt();
		qtdeAnos = nDias/365;
		qtdeMeses = nDias/30;
		System.out.print("Dias: "+nDias+" Meses: "+qtdeMeses+" Anos: "+qtdeAnos);
		in.close();
	}
}
