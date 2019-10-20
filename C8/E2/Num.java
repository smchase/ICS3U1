public class Num
{
	private int n;
	
	public Num(int num)
	{
		n = num;
	}

	public void showWhole()
	{
		System.out.println("> " + n);
	}

	public void showPlace(int place)
	{
		System.out.println("> " + ((n-n%place)/place)%10);
	}
}
