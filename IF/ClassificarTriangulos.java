import java.util.Scanner;

public class ClassificarTriangulos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a medida do lado de um triangulo: ");
		double a = in.nextDouble();
		System.out.print("Digite a medida do outro lado do triangulo: ");
		double b = in.nextDouble();
		System.out.print("Digite a medida do ultimo lado do triangulo: ");
		double c = in.nextDouble();
		if(c<a+b&&b<a+c&&a<b+c) {
			if(a==b&&a==c) {
				System.out.println("Equilatero");
			}else if(a==b || a==c || c==b) {
				System.out.println("Isoceles");
			}else {
				System.out.println("Escaleno");
			}
		}else {
			System.out.println("Nao se pode formar um triangulo com esses valores");
		}
		in.close();
	}
}
