package Problem5;

public class Problem5 {
	public static void main(String[]args) {
	int checker = 1;
	boolean check = false;
	while(!check) {
		boolean check2 = true;
		for(int i =1;i<=20;i++) {
			if(checker%i!=0)
				check2 = false;
		}
		if(check2) check = check2;
		else checker++;
	}
	System.out.print(checker);
	}
}
