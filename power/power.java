import java.util.Scanner;

public class power{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		Scanner bum = new Scanner(System.in);
		int y = bum.nextInt();
		int val = 1;
		for(int i = 1; i <= y; i++){
			val = val * x;
		}
		System.out.println(x+" to the power "+y+" = "+val);
	}
}