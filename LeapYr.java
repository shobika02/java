import java.util.Scanner;
class LeapYr
{
	public static void main(String[] arg)
	{
	int y;
	Scanner in=new Scanner(System.in);
	y=in.nextint();
	if ((y%4==0)||(y%400==0))
	System.out.println(y+"is a leap year");
	else
	System.out.println(y+"is not a leap year");
	}

}