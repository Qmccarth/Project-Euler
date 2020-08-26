package Problem2;

public class Problem2 {
		public static void main(String[]args) {
	     int prevnum = 1;
	     int currnum = 2;
	     int sumeven = 0;
	     int buf = 0;
	     //int sum = 0;
	while(currnum<4000000) {
			if(currnum%2==0)
				sumeven+=currnum;	
			buf = currnum;
			currnum+=prevnum;		
			//sum+=currnum;
			prevnum = buf;
	}
	System.out.print(sumeven);
	}
}
