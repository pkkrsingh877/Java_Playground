import java.util.Scanner;

public class yourgirlfriend{
	public static void main(String[] args){
		Scanner getName = new Scanner(System.in);
		String name = getName.nextLine();
		Scanner getAge = new Scanner(System.in);
		int age = getName.nextInt();
		System.out.print("Enter your girlfriend's phone number :");
		Scanner getNum = new Scanner(System.in);
		int num = getNum.nextInt();
		System.out.println("Your girlfriend's name is "+name);
		System.out.println("She is "+age+" years old.");
		System.out.println("Her phone number is "+num);
	}
}