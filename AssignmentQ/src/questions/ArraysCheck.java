package questions;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements in first Array:");
		int m =s.nextInt();
		System.out.println("Enter elements in second Array:");
		int n = s.nextInt();
		int[] a = new int[m];
		int[] b = new int[n];
		if(m!=n)
		{
			System.out.println("Both the Arrays are of Different size.");
		}
		else
		{
			System.out.println("Enter the elements in first Array:");
			for(int i=0;i<m;i++)
			{
				a[i] =s.nextInt();
			}
			System.out.println("Enter the elements in second Array:");
			for(int i=0;i<n;i++)
			{
				b[i] =s.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int count =0;
			for(int i=0;i<m;i++)
			{
				if(a[i] == b[i])
				{
					count++;
				}
				else
				{
					continue;
				}
			}
			
			if(count ==m )
			{
				System.out.println("Both the Arrays are same.");
			}
			else
			{
				System.out.println("Arrays are Different.");
			}
			
		}
		
		
		s.close();

	}

}
