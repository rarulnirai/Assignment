import java.util.Arrays;

public class Logic {
	
	public static int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        int tail = 0;
        int head = N - 1;
        int minAbsSum = Math.abs(A[tail] + A[head]);
        while (tail <= head) {
            int currentSum = A[tail] + A[head];
            System.out.println("currentSum: " + currentSum);
            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
            // If the sum has become
            // positive, we should know that the head can be moved left
            if (currentSum <= 0)
                tail++;
            else
                head--;
        }
        return minAbsSum;
    }
	
	public static void main(String[] args) {
//		for(int i= 1; i<=3; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.println(j+ " ");
//				System.out.println((i+j) + " ");
//				System.out.println((i*j) + " ");
//			}
//		}
		int[] A = {2, -4, 6, -3, 9};
		System.out.println(Logic.solution(A));
	}

}
