package myfirstpragram;

public class constr {
	
	public static int a;


	constr(int a){
		this.a = a;
	}
	
	public void abc(int a) {
		System.out.println("dbhjl");
	}
	
	
	public static void main(String[] args) {
		
		constr c = new constr(2);
		c.abc(3);
		System.out.println(a);
	}

}
