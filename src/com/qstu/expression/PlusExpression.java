package com.qstu.expression;

public class PlusExpression implements Expression {
	
	private Expression left;
	private Expression right;
	
	

	public PlusExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}



	@Override
	public double interpret(Context s) {
		return left.interpret(s) + right.interpret(s);
	}

}
