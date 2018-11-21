import java.awt.Rectangle;

public class IntersectionPrinter {
public static void main(String args[]) {
	Rectangle r1=new Rectangle(10,20,30,40);
			Rectangle r3=new Rectangle(100,200,300,400);
			Rectangle r2=new Rectangle(120,130,140,150);
			
			Rectangle r4 = r1.intersection(r2);
	        System.out.println("Intersection result: " + r4);

	        Rectangle r5 = r1.intersection(r3);
	        System.out.println("Intersection result: " + r5);
}
}
