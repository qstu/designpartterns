package com.qstu.expression;

public class MinusExpression implements Expression {

	private Expression left;
	private Expression right;
	
	

	public MinusExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}



	@Override
	public double interpret(Context s) {
		return left.interpret(s) - right.interpret(s);
	}

}
