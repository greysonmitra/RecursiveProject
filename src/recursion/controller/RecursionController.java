package recursion.controller;

import recursion.view.*;

public class RecursionController
{
	private RecursionFrame baseFrame;
	

	public void start()
	{
		
	}
	
	
	public MyTwoDController()
	{
		baseFrame = new RecursionFrame(this);
	}
	
	public RecursionFrame getBaseFrame()
	{
		return baseFrame;
	}

}
