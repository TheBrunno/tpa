public class ParesVetor {
	public static void main(String[] args) {
		int a[] = {1, 2, 43, 62, 68, 99, 12, 0, 54, 76};
		int c = 0;
		
		System.out.print("Os numeros pares sao: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
				c++;
			}
		}
		System.out.println("\nOu seja, "+c+" numeros pares.");
	}
}
