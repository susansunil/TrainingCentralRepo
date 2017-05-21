package rpn.implementation;

import java.util.Stack;

public class CalculationContext {

	  private CalculationStrategy strategy;
	  
	  public void setCalucationStrategy(CalculationStrategy strategy) {
	    this.strategy = strategy;
	  }
	  
//	  //use the strategy
//	  public void doCalculation(String str) {
//	    strategy.calculate(str);
//	  }

	public Double doCalculation(Stack stack) {
		// TODO Auto-generated method stub
		return strategy.doCalculation(stack);
	}
	
}
