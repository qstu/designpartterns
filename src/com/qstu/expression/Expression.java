package com.qstu.expression;

public interface Expression {
	
	/**
	 * 解释
	 * @param context 需要解释的上下文
	 * @return 具体语义对应的解释结果
	 */
	double interpret(Context context);

}
