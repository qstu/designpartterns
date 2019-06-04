package com.qstu.expression;

public class ValueExpression implements Expression{
	
	private String key;
	
	

	public ValueExpression(String key) {
		super();
		this.key = key;
	}



	@Override
	public double interpret(Context context) {
		return context.getExpressionByKey(key);
	}

}
