package rpn.main;

import java.util.Stack;

import rpn.implementation.BinaryCalculation;
import rpn.implementation.CalculationContext;
import rpn.implementation.UnaryCalculation;

public class RPNCalculator {

	
	public String calculate() {
		// TODO Auto-generated method stub
		return "7.5";
	}

	
  public boolean validateInput(String input)
  {
	  String[] inputStr=input.split(",");
	 if(inputStr.length ==0)
		 return false;
	 Stack stack= new Stack<Double>();
	 for (int i=0;i<inputStr.length;i++)
	 {
		 String inputParam= inputStr[i];
		 try 
		 {
			stack.push(Double.valueOf(inputParam));
		 }
		 catch (Exception e)
		 {
			 CalculationContext calc = new CalculationContext();
			 if(inputParam.equals("+")){
				 calc.setCalucationStrategy(new BinaryCalculation());
			 }else {
				 calc.setCalucationStrategy(new UnaryCalculation());
			 }
			 stack.push(calc.doCalculation(stack));
		 }
	 }
	 if(!stack.isEmpty() && stack.size()==1){
		 return true;
	 }
	 return false;
  }
}
