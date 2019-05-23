package calculator.mvc;

import java.util.Observable;

public class Calculator extends Observable implements IGUICalculator {

	private int firstNumber;
	private int secondNumber;
	private int result;
	
	@Override
	public int getFirstNumber() {
		return firstNumber;
	}

	@Override
	public int getSecondNumber() {
		return secondNumber;
	}
	
	@Override
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public void update(int firstNumber, int secondNumber, int result) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.result = result;
		
		setChanged();
		notifyObservers();
	}
}
