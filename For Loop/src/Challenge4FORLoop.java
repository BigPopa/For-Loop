import java.util.Scanner;

public class Challenge4FORLoop {

	public static void main(String[] args)
	{
		int sum = 0;
		for (int i = 5; i <= 100; i = i + 5)
		{
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
