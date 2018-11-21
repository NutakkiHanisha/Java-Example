
public class Pyramid2 {
	private int n;
	public Pyramid2(int n) {
	this.n=n;

		int i,j;
   
    for(i=0; i<n; i++)
    {
        for(j=1; j<=i; j++)
        {
            System.out.print(j+ " ");
        }
        System.out.println();
    }
}
	public static void main(String args[]) {
		Pyramid2 p = new Pyramid2(5);
	
		
	}

}
