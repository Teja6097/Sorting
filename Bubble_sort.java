package Sorting;

import java.util.*;

public class Bubble_sort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i,j,k,temp,l;
		n= sc.nextInt();
		int[] arr = new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");	
		}

	}

}
