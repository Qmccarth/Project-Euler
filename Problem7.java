package Problem7;

/* What is the 10 001st prime number? */

public class Problem7 {
	public static void main(String[]args) {
		int num = 3;
		int count = 1;
		int buf = 0;
		boolean prime = true;
		while(count <10001) {
			for(int i=2;i<=Math.sqrt(num); i++) {
				prime = true;
				if(num%i==0) {
					prime = false;
					num++;
					break;
				}
			}
			if(prime) {
				count++;
				buf = num;
				num++;
			}
		}
		System.out.print(buf);
	}
}
