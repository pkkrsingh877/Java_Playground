import java.util.Scanner;

public class Priminal{
    public static void main(String args[]){
		Scanner num = new Scanner(System.in);
        int test = num.nextInt();
		while(test != 0){
			System.out.print("Enter a number: ");
		    int a = num.nextInt();
		    int temp = 5;
            for(int i = 2; i <= a/2; i++){
                if(a % i == 0){
                    temp = 1;
                }else{
                    temp = 0;
                }
            }   
            if(temp == 1){
                System.out.println(a+" is not a PRIME NUMBER.");
            }else if(temp == 0){
                System.out.println(a+" is a PRIME NUMBER.");
            }else{
			    System.out.println("ERROR!");
		    }
			test--;
		}
    }
}
