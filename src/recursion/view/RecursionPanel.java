package recursion.view;

import javax.swing.*;

import java.awt.*;

import recursion.controller.*;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea displayArea;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(10,20);
		fibonacciButton = new JButton("FIB");
		factorialButton = new JButton("");
		inputField = new JTextField(20);
	
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(displayArea);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		displayArea.setEnabled(false);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 34, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -120, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 42, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 238, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 0, SpringLayout.NORTH, factorialButton);
		baseLayout.putConstraint(SpringLayout.EAST, factorialButton, -63, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -68, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, displayArea);
	}
	
	private void setupListeners()
	{
		
	}
}
