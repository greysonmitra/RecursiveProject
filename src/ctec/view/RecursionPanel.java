package ctec.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ctec.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	private SpringLayout baseLayout;
	private JLabel timingLabel;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		resultsArea = new JTextArea(10,30);
		fibonacciButton = new JButton("Get the Fibonacci sequence for this number");
		factorialButton = new JButton("Get n!");
		inputField = new JTextField(20);
		timingLabel = new JLabel("Timer");
		
	
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(resultsArea);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(timingLabel);
		resultsArea.setEnabled(false);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true); 
		resultsArea.setText(baseController.getCalculatedValue());
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, resultsArea, 33, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 88, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -124, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 385, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsArea, -192, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 214, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 317, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 32, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 252, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 234, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, timingLabel, 19, SpringLayout.SOUTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.EAST, timingLabel, 0, SpringLayout.EAST, resultsArea);
	}
	
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					resultsArea.setText(baseController.doFibonacci(userInput));
				}
				timingLabel.setText(baseController.timingInfo());
			}
		
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					resultsArea.setText(baseController.doFactorial(userInput));
				}
				timingLabel.setText(baseController.timingInfo());
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Integer.parseInt(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("NUMBERS ONLY!");
		}
		
		return isNumber;
	}
}
