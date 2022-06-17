package one;
import java.util.*;
public class InsertionSort 
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
		for(i=1;i<n;i++)
		{
			int key = arr[i];
			for(j=i-1;j>=0 && key <arr[j];j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");	
		}

	}

}
