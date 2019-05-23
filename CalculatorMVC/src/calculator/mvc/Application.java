package calculator.mvc;

import java.awt.EventQueue;

public class Application {
	
	public void start() {
		Calculator calculator = new Calculator();
		
		for(int i = 0; i < 1; i++) {
			
			createAndShowFrame(calculator, i);
		}	
	}

	private void createAndShowFrame(Calculator calculator, int i) {
		CalculatorController controller = new CalculatorController(calculator);
		CalculatorView view = new CalculatorView(controller, calculator);
		
		controller.setView(view);
		
		view.setLocation(i * view.getWidth(), i * view.getHeight());
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				view.setVisible(true);
			}
		});
		
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		new Application().start();
		for(;;)
			System.out.println("Working");
	}
	
}
