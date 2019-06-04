package com.qstu.expression;

public class Client {

	public static void main(String[] args) {

		Context context = new Context();
		context.addExpression("a", 1);
		context.addExpression("b", 2);
		context.addExpression("c", 3);
		context.addExpression("d", 4);
		
		
		Expression aValue = new ValueExpression("a");
		Expression bValue = new ValueExpression("b");
		Expression cValue = new ValueExpression("c");
		Expression dValue = new ValueExpression("d");
		
		//(c+d)
		Expression cdPlus = new PlusExpression(cValue, dValue);
		//(a+b)
		Expression abPlus = new PlusExpression(aValue, bValue);
		
		//(c + d) - (a + b)
		Expression minusExpression = new MinusExpression(cdPlus, abPlus);
		double interpret = minusExpression.interpret(context);
		
		System.out.println("(c + d) - (a + b) = " + interpret);
	}

}
