package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class OrderByFirstLetterInSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String strArr[]=str.split(" ");
		//my name is tanya
		//0   1    2  3
		//------compareTo()-------
		//compare first with every other lexicographically. It returns a positive number, negative number, or 0.
		for(int i=0;i<strArr.length-1;i++)
		{
			for(int j=i+1;j<strArr.length;j++)
			{
				if(strArr[i].compareTo(strArr[j])>0)//means if i wala is greater then second wala
				{
					String temp=strArr[i];
					strArr[i]=strArr[j];
					strArr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(strArr));
		
		
		
//		//-----Arrays.sort()------
//		Arrays.sort(strArr);
//		System.out.println(Arrays.toString(strArr));
		
		

	}

}
