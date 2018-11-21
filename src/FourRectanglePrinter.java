import java.awt.Rectangle;

public class FourRectanglePrinter {
	public static void main(String args[]) {
		System.out.println(" ");
		Rectangle box = new Rectangle(10, 20, 30, 40);
				System.out.println(box);
		
		 box.translate(0,30);
				System.out.println(box);
		 box.translate(40,0);
				System.out.println(box);
		 box.translate(40,30);
				System.out.println(box);

		
		
	}

}
