import java.util.Scanner;

public class Pascal {
	public void triangle(int rows) {
		for(int i =0;i<rows;i++) {
	        int number = 1;
	        System.out.format("%"+(rows-i)*3+"s","");
	        for(int j=0;j<=i;j++) {
	             System.out.format("%6d",number);
	             number = number * (i - j) / (j + 1);
	            
	        }
	        System.out.println();
	    }
}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

	System.out.print("Enter Number of Rows : ");
	int r = scan.nextInt();
		Pascal a=new Pascal();
		a.triangle(r);
	}
}