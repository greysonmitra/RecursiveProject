package recursion.view;

import recursion.controller.RecursionController;
import javax.swing.*;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel basePanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 
		this.setSize(800,800); 			
		this.setTitle("Recursion");
		this.setResizable(false);  
		this.setVisible(true);
	}
	
	public RecursionController getBaseController()
	{
		return baseController;
	}
	
}
