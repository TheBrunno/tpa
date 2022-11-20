public class IndicePotencia {
	public static void main(String[] args) {
		final int SIZE = 11;
		int a[] = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			a[i] = (int) Math.pow(2, i);
		}
		
		for(int i=0; i<SIZE; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
