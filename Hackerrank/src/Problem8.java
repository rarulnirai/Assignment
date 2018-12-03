import java.util.Arrays;

public class Problem8 {
	
	public int calcateMin(int[] arr) {
		int sum = 0;
		int min = arr[0] + arr[arr.length-1];
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int[] subArray = Arrays.copyOfRange(arr, i, j+1);
				for(int k = 0; k < subArray.length; k++) {
					sum += subArray[k];
				}
				sum = Math.abs(sum);
				if(min > sum) {
					min = sum;
				}
				sum=0;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = {2, -4, 6, -3, 9};
		Problem8 p = new Problem8();
		int min = p.calcateMin(arr);
		System.out.println("min: " + min);
	}

}
