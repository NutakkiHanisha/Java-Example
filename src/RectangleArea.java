import java.awt.Rectangle;

public class RectangleArea {
	public static void main(String args[]) {
		Rectangle r1=new Rectangle(10,20,60,70);
		double area = r1.getWidth()*r1.getHeight();
		System.out.println("Area: " + area);
		System.out.println("Expected area :4400");
	
	}

}
