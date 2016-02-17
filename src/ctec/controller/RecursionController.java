package ctec.controller;

import ctec.model.*;
import ctec.view.RecursionFrame;

public class RecursionController
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	private CodeTimer myTimer;
	
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
		myTimer = new CodeTimer();
	}
	
	public void start()
	{
		calculatedValue = Integer.toString(mathTool.getFibNumber(0));
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}
	
	public String doFibonacci(String inputValue)
	{
		calculatedValue = "The Fibonacci sequence number of " + inputValue + " is " + Integer.toString(mathTool.getFibNumber(Integer.parseInt(inputValue)));
		
		return calculatedValue;
	}
	
	public String doFactorial(String inputValue)
	{
		calculatedValue = "The factorial of " + inputValue + " is " + Double.toString(mathTool.getFactorialNumber(Integer.parseInt(inputValue)));
		
		return calculatedValue;
	}
	
	public String timingInfo()
	{
		return myTimer.toString();
	}
	
//	public MyTwoDController()
//	{
//		baseFrame = new RecursionFrame(this);
//	}
	
	public RecursionFrame getBaseFrame()
	{
		return baseFrame;
	}

}
