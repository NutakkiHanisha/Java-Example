
public class Student3 {
	private static int getSquare(int x){
        return x * x;
    }

    public static void main(String[] args) {
    	int result;
        for (int i = 2; i <= 8; i++) {

            
            result = getSquare(i);
            System.out.println("Square of " + i + " is : " + result) ;
    }
}
}


