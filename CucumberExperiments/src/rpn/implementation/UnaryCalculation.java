package rpn.implementation;

import java.util.Stack;

public class UnaryCalculation implements CalculationStrategy {

//	@Override
//	public String calculate(String str) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public Double doCalculation(Stack stack){
		Double input1 = ((Double)stack.pop());
		Double result = (input1.doubleValue())+1;
		return result;
	}
}
