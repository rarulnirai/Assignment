
public class Problem15 {
	public static void main(String[] args) {
		String s="(())))(";
		String A = s.substring(0, (int)Math.ceil(s.length()/2)+1);
		String B = s.substring((int)Math.ceil(s.length()/2)+1,s.length());
		System.out.println(A + " " + B);
		char[] aToChar = A.toCharArray();
		char[] bToChar = B.toCharArray();
		int openBrack = 0;
		int closeBrack = 0;
		int k=0;
		for(int i =0; i<A.length(); i++) {
			if(aToChar[i] == '(') {
				openBrack++;
			}
		}
		for(int i =0; i<B.length(); i++) {
			if(bToChar[i] == ')') {
				closeBrack++;
			}
		}
		if(openBrack == closeBrack) {
			k = openBrack + closeBrack;
		}
		System.out.println(k);
	}

}
