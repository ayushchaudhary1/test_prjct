package myfirstpragram;

//public class hellojava {
//
//	public static void main(String[] args) {
//			myMethod();
//			myMethod();
//			myname(2, 3);
//	}
////		int[] a = new int[3];
////		int[] a = {1, 2, 1};
////		for(int i=0; i<a.length; ++i) {
////		System.out.println(a[i]);
////		}
//	public static void myMethod() {	
//		int[][] b = {{1,2,3}, {4,5,6}};
//		for(int i = 0; i<b.length; i++) {
//			for(int j = 0; j<b[i].length; j++) {
//				System.out.println(b[i][j]+"");
//			}
//			System.out.println('a');
//		}
//	}
//	public static int myname(int a, int b) {
//		int c = a+b;
//		System.out.println(c);
//		System.out.println("Aayush chaudhary");
//		return c;
//		}
//	
//		}


public class Animal {
	public void eat() {
		System.out.println("dy");
	}
}
class Dog extends Animal {
	public void eating() {
		System.out.println("ad");
	}
}
class cat extends Dog {
	public static void main(String[] args) {
		cat c = new cat();
		c.eat();
		c.eating();
	}
}