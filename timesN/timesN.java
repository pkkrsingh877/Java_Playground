import java.util.Scanner;

public class timesN{
	public static void main(String[] args){
		System.out.print("Enter the number: ");
		Scanner num = new Scanner(System.in);
		int gum = num.nextInt();
		System.out.print("Enter times how many you want to multiply "+gum+" with: ");
		Scanner N = new Scanner(System.in);
		int bum = N.nextInt();
		int chum = gum * bum;
		System.out.println(gum+" * "+bum+" is equal to "+chum+".");
	}
}