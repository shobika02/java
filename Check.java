import java.util.Scanner;
class Check
{
	public static void main(String[] arg)
	{
	char s;
	Scanner in = new Scanner(System.in);
	s=in.nextLine();
	if((s>='a'&& s<='z')||(s>='A'&& s<='Z'))
	System.out.println(s +"is an alphabet");
	else
	System.out.println(s +"is not an alphabet");

}

}