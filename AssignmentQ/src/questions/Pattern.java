package questions;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter numbers upto which you want pattern:");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		s.close();

	}

}
