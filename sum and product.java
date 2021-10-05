import java.until.*;
public class  sum and product
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element you want");
		int n=sc.nextIn();
		int[]arr =new int[n];
		for(int i=0;i<n;i++){
      System.out.print("Enter element:"+(i+1));
	  arr[i]=sc.nextInt();}
	  System.out.println("Array entered is:");
	  for(int i=0;i<n;i++)
		{
		  System.out.print(arr[i] + " ");}
int sum =0;
for(int i=0;i<n;i++)
		{
	sum=sum + arr[i];
		}
		System.out.println("\n sum of array element are:" + sum);
		for product = mul=mul*arr[i]; 
		
		}
}