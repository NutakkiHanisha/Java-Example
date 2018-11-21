
public class Pyramid5 {
	public static void floydTriangle(int n) {
		int i, j,k=1;
		for( i=0; i<n; i++) 
		{
			for(j=0; j<=i; j++)
			{
				System.out.print( k+ " ");
				k = k+1;
			}
			System.out.println( );
		}
	}
	public static void main(String args[]) {
		int n = 5;
		floydTriangle(n);
	}

}
