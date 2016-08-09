import java.util.Scanner;
class RvIn
{
	public static void main(String[] arg)
	int n,rem,rev;
	Scanner in=new Scanner(System.in);
	while(rem!=0)
	{
	rem=n%10;
	rev=n/10;
	rem=rem*10+rev;
	}
System.out.println("print the reverse string : " + rem);

}