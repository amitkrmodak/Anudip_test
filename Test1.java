// Write a program to find the sum of even numbers between 25 to 51.
// Name: Amit Kumar Modak
class Test1
{
	public static void main(String args[])
	{
		int s=0; // use to store sum value
		for(int i=25; i<=51; i++)
		{
			if(i%2==0) // checking even
			{
				s+=i;
			}
		}
		System.out.println(s);
	}
}