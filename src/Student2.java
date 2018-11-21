
public class Student2 {
public static void main(String arga[]) {
	 int result, n;
	 int result1,m;
     
     n = 3;m=4;
     result = square(n);
     result1 = add(m);
     System.out.println("Square of 3 is: " + result);
     System.out.println("add of 4 is: " + result1);
     
     n = 4;m=5;
     result = square(n);
     result1 = add(m);
     System.out.println("Square of 4 is: " + result);
     System.out.println("add of 5 is: " + result1);
 }

	 public static int square(int i) {
     return i * i;
 }
	public static int add(int i) {
		return i + i;
	}
	}

