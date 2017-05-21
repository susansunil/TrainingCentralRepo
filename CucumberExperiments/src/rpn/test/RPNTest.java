package rpn.test;

import static org.junit.Assert.*;

import org.junit.Test;

import rpn.main.RPNCalculator;

public class RPNTest{

	@SuppressWarnings("deprecation")
	@Test
	public void validateInput()
		{
	 String input= new String ("2,1,++,+");
	 RPNCalculator rPNCalculator=new RPNCalculator();
	 
	boolean result=rPNCalculator.validateInput(input);
	 assertEquals(true,result);
	 
	}
	
	@Test
	public void validateAddition()
	{
		String input= new String ("2,1");
		 RPNCalculator rPNCalculator=new RPNCalculator();
		 
		String result=rPNCalculator.calculate();
		 assertEquals("7.5",result);
		 
	}
}
