package Array;

import java.lang.*;
import java.util.*;

public class Staircase{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of levels");
		int n=sc.nextInt();
		int count=0;
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=count;j++)
			{
				arr[i][j]=1;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			count++;	
		}
	}
}
