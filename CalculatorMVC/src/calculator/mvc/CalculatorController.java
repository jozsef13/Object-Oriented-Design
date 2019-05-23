package calculator.mvc;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculatorController implements ICalculatorController {

	private ICalculatorView view;
	private IGUICalculator calculator;

	public CalculatorController(IGUICalculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void setView(ICalculatorView view) {
		this.view = view;
	}

	@Override
	public void addition() {
		try {
			int firstNumber = view.getFirstNumber();
			int secondNumber = view.getSecondNumber();
			int result = firstNumber + secondNumber;
			calculator.setResult(result);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog((JFrame) view, "Please type only digits in the fields!", "Number input error!", JOptionPane.ERROR_MESSAGE);;
		}
	}

	@Override
	public void substraction() {
		try {
			int firstNumber = view.getFirstNumber();
			int secondNumber = view.getSecondNumber();
			int result = firstNumber - secondNumber;
			calculator.setResult(result);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog((JFrame) view, "Please type only digits in the fields!", "Number input error!", JOptionPane.ERROR_MESSAGE);;
		}
	}

	@Override
	public void operationResult() {
		
		try {
			int firstNumber = view.getFirstNumber();
			int secondNumber = view.getSecondNumber();
			int result = calculator.getResult();
			
			calculator.update(firstNumber, secondNumber, result);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog((JFrame) view, "Please type only digits in the fields or some error!", "Number input error!", JOptionPane.ERROR_MESSAGE);;
		}
		
	}
	
}
