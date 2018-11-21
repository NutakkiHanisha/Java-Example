
public class Pyramid7 {
	static void printDiamond(int n) 
    { 
        int k = n - 1; 
       
        for (int i = 0; i < n; i++) 
        {  
            for (int j = 0; j <k; j++) 
                System.out.print(" "); 
      
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            k--; 
        } 
        k = 0; 
       
        for (int i = n; i > 0; i--) 
        { 
       
            for (int j = 0; j < k; j++) 
                System.out.print(" "); 
      
       
            for (int j = 0; j < i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            k++; 
        } 
    } 
      
     
    public static void main(String[] args)  
    { 
        printDiamond(5); 
          
    } 
}
