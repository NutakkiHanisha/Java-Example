
public class Pyramid4 {
	public static void reverseNumbers(int n) {
		int i,j;
		 for ( i = n; i>0; i--) {
             for ( j = 1; j <= i; j++) {
                   System.out.print(j);
             }
             System.out.println("");
      }
	}
	public static void main(String args[]) {
	int n=5;
	reverseNumbers(n);
	}

}
