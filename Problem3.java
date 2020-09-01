package Problem3;
/*What is the largest prime factor of the number 600851475143 ? */

public class Problem3 {
	public static void main(String[]args) {
	long num = 600851475143L;
	long i;
	for(i = 2; i<+num;i++ ) {
		if(num%i==0) {
			num/=i;
			i--;
		}
	
	}
	System.out.print(i);	
}
}
