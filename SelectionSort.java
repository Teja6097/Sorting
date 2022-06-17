package one;

import java.util.*;
public class Selection 
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
		int min;
		for(i=0;i<n-1;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
				
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");	
		}

		
		

	}

}
