package recursion.controller;

public class RecursionController
{

	private int fibonacci(int currentNumber)
	{
		int fibonacciValue = 0;
		if (currentNumber >= 0)
		{
			if (currentNumber <= 1)
			{
				return 1;
			}
			else
			{
				return fibonacci(currentNumber - 1) + fibonacci(currentNumber - 2);
			}
		}

		return fibonacciValue;
	}

	private int factorial(int currentNumber)
	{
		int factorialValue = 0;
		if (currentNumber >= 0)
		{
			if (currentNumber <= 1)
			{
				return 1;
			}
			else
			{
				return factorial(currentNumber - 1) * currentNumber;
			}
		}

		return factorialValue;
	}

	public void start()
	{
		for (int count = 0; count < 17; count++)
		{
			// System.out.println(fibonacci(count));
			System.out.println(factorial(count));
		}

		System.out.println(fibonacci(5));
	}

}
