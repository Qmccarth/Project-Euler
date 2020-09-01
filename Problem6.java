package Problem6;

/* Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */
public class Problem6 {
	public static void main(String[]args) {
		int sum = 0;
		int sumsq = 0;
		int buf = 0;
		for(int i =1;i<=100;i++) {
			sum+=i;
			sumsq+=i*i;
		}
		buf = sum*sum - sumsq;
		System.out.print(buf);
	}
}
