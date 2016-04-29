import java.util.Scanner;
public class Challenge5FORLoop 
{
	public static void main(String[] args) 
	{
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Tell me what you want the lower number to be");
		int lower = userInput1.nextInt();
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Tell me what you want the upper number to be");
		int upper = userInput2.nextInt();
		int sum = 0;
		for (int i = lower; i <= upper; i = i + 1)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
