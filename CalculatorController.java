package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController implements Initializable {
	@FXML Label lblText, lblResult, lblP;
	@FXML Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnMinus, btnDiv, btnMul, btnClear, btnEnter;
	public int result, n, x, y;
	public String arithmetic;
	public String num;
	
	private CalModel model = new CalModel();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void btn0Action(ActionEvent event) {
		n = 0;
		makenum(n);
	}
	
	public void btn1Action(ActionEvent event) {
		n = 1;
		makenum(n);
	}
	
	public void btn2Action(ActionEvent event) {
		n = 2;
		makenum(n);
	}
	
	public void btn3Action(ActionEvent event) {
		n = 3;
		makenum(n);
	}
	
	public void btn4Action(ActionEvent event) {
		n = 4;
		makenum(n);
	}
	
	public void btn5Action(ActionEvent event) {
		n = 5;
		makenum(n);
	}
	
	public void btn6Action(ActionEvent event) {
		n = 6;
		makenum(n);
	}

	public void btn7Action(ActionEvent event) {
		n = 7;
		makenum(n);
	}

	public void btn8Action(ActionEvent event) {
		n = 8;
		makenum(n);
	}

	public void btn9Action(ActionEvent event) {
		n = 9;
		makenum(n);
	}

	public void btnAddAction(ActionEvent event) {
		arithmetic = "+";
		makelog(arithmetic);
	}

	public void btnMinusAction(ActionEvent event) {
		arithmetic = "-";
		makelog(arithmetic);
	}

	public void btnDivAction(ActionEvent event) {
		arithmetic = "/";
		makelog(arithmetic);
	}

	public void btnMulAction(ActionEvent event) {
		arithmetic = "x";
		makelog(arithmetic);
	}

	public void btnClearAction(ActionEvent event) {
		lblResult.setText("");
		lblP.setText("");
	}

	public void btnEnterAction(ActionEvent event) {
		y = Integer.parseInt(lblResult.getText());
		num = lblP.getText();
		
		lblP.setText(num + y + " = ");
		result = model.calculate(arithmetic, x, y);
		lblResult.setText(Integer.toString(result));
		
		num = lblP.getText();
		lblP.setText(num+result);
	}

	public void makenum(int n) {
		num = lblResult.getText();
		lblResult.setText(num + Integer.toString(n));	//	기존 숫자에 새로 들어온 숫자를 문자로 연결
	}
	
	public void makelog(String arithmetic) {
		x = Integer.parseInt(lblResult.getText());
		lblResult.setText("");
		lblP.setText(Integer.toString(x) + " " + arithmetic + " ");
	}
}

