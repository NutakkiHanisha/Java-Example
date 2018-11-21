import java.util.Scanner;

public class Table1 {
	public static void main(String args[]) {
		int k;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		
	 k=in.nextInt();
	 multiTable(k);
		
        }
	public static void multiTable(int k) {
		int i,j;
		for(i=k; i<10; i++) {
			for(j=1;j<=20;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println(" ");
	}
	}
        
}	


