package com.qstu.expression;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	private Map<String, Double> expressions = new HashMap<>();
	
	public void addExpression(String key, double value) {
		expressions.put(key, value);
	}

	public double getExpressionByKey(String key) {
		return expressions.get(key);
	}
}
