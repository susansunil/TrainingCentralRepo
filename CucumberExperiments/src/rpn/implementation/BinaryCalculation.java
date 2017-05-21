package rpn.implementation;

import java.util.Stack;

public class BinaryCalculation implements CalculationStrategy{

//	@Override
//	public String calculate(String str) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public Double doCalculation(Stack stack){
		Double input1 = ((Double)stack.pop());
		Double input2 = ((Double)stack.pop());
		Double result = Double.valueOf(input1.doubleValue() +input2.doubleValue());
		return result;
	}

}
