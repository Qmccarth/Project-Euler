package Problem4;

public class Problem4 {
	public static void main(String[]args) {
		int check = 0;
		int max = 0;
		String checkString;
		String maxString = null;
		String buf = null;
		for(int i = 1; i<=999;i++) {
			for(int j = 1; j<=999;j++) {
				checkString = Integer.toString(i*j);
				buf = new StringBuilder(checkString).reverse().toString();
				check = Integer.parseInt(checkString);
				if(checkString.contentEquals(buf) && check > max) {
					maxString = checkString;
					max = Integer.parseInt(maxString);
				}
			}
		}
		System.out.print(maxString);	
	}
}
