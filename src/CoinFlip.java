import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number of times to flip coin:");
		int f=scan.nextInt();
		int heads=0;
		int tails=0;
		for(int i=0;i<f;i++)
		{
			if (Math.random() < 0.5) {
			    tails++;
			} else {
			    heads++;
			}
		}
		 double headsPer =(double) heads / f * 100;
	     double tailsPer = (double) tails / f * 100;
	     System.out.println("Heads: "+headsPer);
	     System.out.println("Tails: "+tailsPer);
	}

}
