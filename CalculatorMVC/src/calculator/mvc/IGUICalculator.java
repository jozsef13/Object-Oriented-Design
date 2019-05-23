package calculator.mvc;

import java.util.Observer;

public interface IGUICalculator {
	
	void addObserver(Observer o);

	void deleteObserver(Observer o);
	
	int getFirstNumber();
	
	int getSecondNumber();
	
	int getResult();
	
	void setResult(int result);
	
	void update(int firstNumber, int secondNumber, int result);
}
