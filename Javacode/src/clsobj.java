
public class clsobj {
	int d = 3;
	public static void main(String[] args) {
		clsobj ob = new clsobj();
		ob.abc();
		System.out.println(ob.d);
		
	}
	public static void abc() {
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.println(c);
	}

}
