package application;

public class CalModel {
	public int calculate(String arithmetic, int x, int y) {
		int result = 0;
		switch(arithmetic) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "x":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;
		}
		return result;
	}
		
}
