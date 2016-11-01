package graphic.view;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import graphic.controller.FirstGUIController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel
{
	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout  baseLayout;

	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;

		colorButton = new JButton("Color!");
		randomButton = new JButton("Random");
		baseLayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.cyan);
		this.add(colorButton);
		this.add(randomButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, 0, SpringLayout.EAST, colorButton);
	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				setBackground(Color.GREEN);
			}
		});
	}

}
