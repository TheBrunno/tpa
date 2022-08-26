import java.util.Scanner;

public class CalcIrpf {
	public static void main(String[] args) {
		double porc = 0, redZ = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o salario: ");
		double sal = in.nextDouble();
		if(sal<=1434.59) {
			porc=0;
			redZ=0;
		}else if(sal <= 2150.00) {
			porc=7.5;
			redZ=107.59;
		}else if(sal <= 2866.70) {
			porc=15;
			redZ=268.84;
		}else if(sal <= 3582.00) {
			porc=22.5;
			redZ=483.84;
		}else if(sal >  3582.00) {
			porc=27.5;
			redZ=662.94;
		}
		double irpf = (sal*porc/100)-redZ;
		System.out.println("O IRPF a pagar e: "+irpf);
		in.close();
	}
}
