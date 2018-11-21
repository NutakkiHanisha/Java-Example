import java.util.Random;

public class LotteryPrinter {
	public static void main(String[] args)
    {
        Random random = new Random();

        System.out.println("Play this combination — it'll make you rich!");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1 + " ");
        System.out.print(random.nextInt(49) + 1);
    }
}
