public class Inverso {
	public static void main(String[] args) {
		final int SIZE = 10;
		
		int a[] = {123, 45, 76, 23, 154, 982, 24, 3, 0, 387};
		int b[] = new int[SIZE];
		
		for(int i=(a.length-1);i>=0;i--) {
			b[a.length-1-i] = a[i];
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]);
			if(i<b.length-1) {
				System.out.print(", ");
			}
		}
	}
}
