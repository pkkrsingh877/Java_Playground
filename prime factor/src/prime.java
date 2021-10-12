
public class prime {

	public prime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 600851475143L;
		long i = 2L;
		while(i <= num/2) {
			if(num%i == 0) {
				System.out.print(i+", ");
			}
		}
		System.out.println(num*2);
	}

}
