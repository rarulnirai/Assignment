import java.util.Scanner;

//factorial recursion
public class HRDay9 {

	static int factorial(int n) {
		if(n == 0 || n == 1){
			return 1;
		}
		else{
			return factorial(n-1) * n;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 'n' value: ");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println(result);
		sc.close();
	}

}
