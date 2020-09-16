package Problem13;

/* Which starting number, under one million, produces the longest Collatz chain? */



public class Problem13 {
	public static void main(String[]args) {
		int count = 0;
		int maxcount = 0;
		int ma = 0;
		int buf = 0;
		int i;
		for(i = 13; i <1000000; i++) {
			buf = i;
			count = 1;
			while(buf > 1) {
				if(buf%2==0) {
					buf = buf/2;
					count++;
				}
				else {
					buf = 3*buf + 1;
					count++;
				}
			}
			if(count > maxcount) {
				maxcount = count;
				ma = i;
			}
		}
		System.out.print(ma);
	}
}
