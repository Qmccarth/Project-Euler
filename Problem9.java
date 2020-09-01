package Problem9;

/* There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. */

public class Problem9 {
	public static void main(String[]args) {
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i = 1;i <= 1000; i++) {
			for(int j = 1;j <= 1000; j++) {
				for(int k = 1;k <= 1000; k++) {
					int sum = i + j +k;
					if(sum == 1000 && i*i+j*j ==k*k) {
						a = i; b = j; c = k; 
					}
				}
			}
		}
		System.out.println(a*b*c);
	}
}
