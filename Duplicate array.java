import java.until.*;
public class  Duplicate array
{
	public static void main(String[] args) 
	{
		int arr[]={2,5,3,1,8,7,5,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[i])
				{
		System.out.println(arr[i]);
	}
}
		}
	}