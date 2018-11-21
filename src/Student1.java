
public class Student1 {
public static void main(String args[]) {
	int studenta = 11;
    int studentb = 12;
    double studentc = 7.3;
    double studentd = 9.4;
    
    int result1 = minFunction(studenta, studentb);
   double result2 = minFunction(studentc, studentd);
   
    System.out.println("Minimum Marks of student a and b = " + result1);
    System.out.println("Minimum Marks of student c and d = " + result2);
 }

 
 public static int minFunction(int n1, int n2) {
    int min;
    if (n1 > n2)
       min = n2;
    else
       min = n1;

    return min; 
 }
 
 
 public static double minFunction(double n1, double n2) {
   double min;
    if (n1 < n2)
       min = n2;
    else
       min = n1;

    return min; 
}
}
