import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Problem1 {
	public static void main(String[]args) {
	 int sum = 0;
     int num1 = 3;
     int num2 = 5;
for(int i =0;i<1000;i++) {
	if(i%num1 == 0 || i%num2 == 0)
		sum+=i;
	else if(i%(num1*num2) == 0)
		sum-=i;			
}
System.out.print(sum);
}
}
