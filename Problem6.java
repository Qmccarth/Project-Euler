package Problem6;

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
