import java.util.Scanner;

public class Table2 {
	public static void main(String args[]) {
		int k;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		
	 k=scan.nextInt();
	 multiTable(k);
		
        }
	public static void multiTable(int k) {
		int i;
		for(i=1; i<=20; i++) {
			
				System.out.println(k + " * " + i + " = " + (k*i));
			}
			System.out.println(" ");
	
	}
}
