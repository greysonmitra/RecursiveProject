package recursion.model;

public class RecursionTool
{

	public int getFibNumber(int position)
	{

		//Defensive code against user misuse aka THERE ARE NO NEG NUMBERS IN FIBONACCI YOU...
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base case
		if(position == 0 || position == 1) 
		{
			return 1;
		}
		else //Recursive case - must keep calling method.
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2); 
			//SO BASICALLY FIBNUMBER POSITION - 1 GIVES THE NUMBER BEFORE OUR DESIRED NUMBER AND FIBNUMBER POSITION - 2 GIVES THE NUMBER 2 spaces BEFORE OUR DESIRED NUMBER. what this means is what I already know about the "Fibonacci Sequence." All it is is adding up the two previous numbers to get the next in the sequence. DUH!
			//Position is just the number that is given by the user. It is the number input-ed into our little application. The code in this class takes it and adds the two numbers before it, via this else block, to get the desired number.
			//And because it keeps calling itself over and over again. It just keeps taking the number it just calculated using the else block and calculating it again. so it takes forever and isn't efficient.
		}
	}
	
	public double getFactorialNumber(double position)
	{
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		
		if(position == 0) 
		{
			return 1;
		}
		else 
		{
			return position * getFactorialNumber(position - 1);
		}
	}
}
