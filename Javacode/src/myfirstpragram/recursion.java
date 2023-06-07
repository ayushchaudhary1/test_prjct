package myfirstpragram;

public class recursion {

	public static void main(String[] args) {
	int d = sum(10);
	System.out.println(d);

	}
	public static int sum(int k) {
		if(k>0) {
			return k + sum(k-1);
	}
		else{
		return 0;
		}
	}

}
