public class remove {
	public static void main(String[] args) {
		arrtest();
		int d = overload(1, 2);
		System.out.println(d);
		overload(2, 0.25);
	}
		
		public static void arrtest() {
			
			int[] a = {1, 2, 3};
			System.out.println(a[2]);
			a[2] = 4;
			System.out.println(a[2]);
			a[1] = 5;
			for(int i = 0; i<3; i++) {
				System.out.println(a[i]);
			}
		}
		public static int overload(int a, int b) {
			int c = a+b;
			System.out.println(c);
			return c;
		}
		public static double overload(int a, double b) {
			double c = a+b;
			System.out.println(c);
			return c;
		}
}
		
	
