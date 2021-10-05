import java.until.*;
public class  Big fractional
{
	public static void main(String[] args) 
	{
		BigInteger fac=new BigInteger("1");
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			fac=fac.multiply(BigInteger.valueof(i));
	}
	System.out.print(fac);
}
}