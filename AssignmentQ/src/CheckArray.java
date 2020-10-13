

import java.util.Scanner;
public class CheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Enter no of elements you want in array:");
		 int n = s.nextInt();
		int[] a =new int[n];
		
		int b[] =  new int[n];
		System.out.println("Enter elements  in 1st array:");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Enter no of elements in 2nd array:");
		for(int i=0;i<b.length;i++)
		{
			b[i] =s.nextInt();
		}
		
		int count =0;
		for(int i=0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				if(a[i] == b[j])
				{
					count++;
				}
			}
		}
		if(count == n)
		{
			System.out.println("Elements in both array are same.");
		}
		else if(count> n)
		{
			System.out.println("There are same elements also present in arrays.");
		}
		else
		{
			System.out.println("Both Arrays are different.");
		}
		
        s.close();
	}

}
