public class Raizes {
	public static void main(String[] args) {
		final int SIZE = 10;
		double a[] = {25, 169, 81, 9, 144, 625, 1024, 4, 121, 16};
		double b[] = new double[SIZE];
		
		for(int i=0;i<a.length;i++) {
			b[i] = Math.sqrt(a[i]);
			if (i == 0) {
				System.out.print("[");
			}else {
				System.out.print(", ");
			}
			System.out.print(b[i]);
			if(i == SIZE-1) {
				System.out.print("]");
			}
		}
	}
}
