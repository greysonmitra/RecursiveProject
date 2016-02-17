package ctec.model;

/**
 * 
 * @author gmit3891
 *@version 0.1 Feb 17, 2016 Added basic methods and constructor to make use of a timer.
 */
public class CodeTimer
{
	private long executionTime;
	
	
	
	public CodeTimer()
	{
		this.executionTime = 0;
	}
	
	public void startTimer()
	{
		this.executionTime = System.nanoTime();
	}
	
	public void stopTimer()												// These two methods (start and stop timer) occur one after the other to ensure that the stop time will give a positive value. 
	{																	//This is guaranteed because it occurs after the start timer in the actual source code. 			
		this.executionTime = System.nanoTime() - executionTime;
	}
	
	public void resetTimer()
	{
		this.executionTime = 0;
	}
	
	public long getExecutionTime()
	{
		return executionTime;
	}
	
	public String toString()
	{
		String timerDescription = "Currently, the time to execute is: " + this.executionTime + ", in nanoseconds.";
 		
		return timerDescription;
	}
}
