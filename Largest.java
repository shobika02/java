import java.util.Scanner;
class Largest
{
	public static void main(String[] arg)
	{
	int a,b,c;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the three numbers :")
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a>b&&a>c)
	System.out.println(a + "is largest");
	else if(b>a&&b>c)
	System.out.println(b + "is largest");
	else
	System.out.println(c + "is largest");
}
}