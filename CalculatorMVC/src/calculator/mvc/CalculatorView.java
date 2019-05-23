package calculator.mvc;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class CalculatorView extends JFrame implements Observer, ICalculatorView {

	private IGUICalculator calculator;
	private JTextField firstNumberField;
	private JTextField secondNumberField;
	private JButton equalButton;
	protected ICalculatorController controller;
	private JTextField resultField;
	private ButtonGroup group;
	private JRadioButton plusButton;
	private JRadioButton minusButton;
	private JPanel radioPanel;
	
	public CalculatorView(ICalculatorController controller, IGUICalculator calculator) throws HeadlessException {
		super();
		this.controller = controller;
		this.calculator = calculator;
		init();
	}
	
	private void init() {
		setTitle("MVC Calculator.");
		setLayout(new GridLayout(4, 4));
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		calculator.addObserver(this);
		
		add(new JLabel("First Number "));
		firstNumberField = new JTextField(calculator.getFirstNumber());
		add(firstNumberField);
		
		add(new JLabel("Second Number "));
		secondNumberField = new JTextField(calculator.getSecondNumber());
		add(secondNumberField);
		
		group = new ButtonGroup();
		radioPanel = new JPanel(new GridLayout(0, 1));
		
		plusButton = new JRadioButton("Addition");
		group.add(plusButton);
		radioPanel.add(plusButton);
		
		plusButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				controller.addition();
			}
		});
		
		minusButton = new JRadioButton("Substraction");
		group.add(minusButton);
		radioPanel.add(minusButton);
		
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				controller.substraction();
			}
		});
		
		add(radioPanel);
		
		equalButton = new JButton("=");
		add(equalButton);
		
		equalButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {
				controller.operationResult();
			}
		});
		
		pack();
		
		add(new JLabel("Result "));
		resultField = new JTextField(calculator.getResult());
		add(resultField);
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		firstNumberField.setText("" + calculator.getFirstNumber());
		secondNumberField.setText("" + calculator.getSecondNumber());
		resultField.setText("" + calculator.getResult());
	}

	@Override
	public int getFirstNumber() {
		return Integer.parseInt(firstNumberField.getText());
	}

	@Override
	public int getSecondNumber() {
		return Integer.parseInt(secondNumberField.getText());
	}

	@Override
	public int getResult() {
		return Integer.parseInt(resultField.getText());
	}

}
