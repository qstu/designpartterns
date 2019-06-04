package com.qstu.expression;

import java.util.HashMap;
import java.util.Map;

public class Context {
	/**
	 * 需要解释的数据集合，这些数据一般在终结节点获取
	 * 非终结节点一般是定义语义实现
	 */
	private Map<String, Double> expressions = new HashMap<>();
	
	/**
	 * 插入解释器需要的数据
	 * @param key 解释元素
	 * @param value 对应的数值
	 */
	public void addExpression(String key, double value) {
		expressions.put(key, value);
	}

	/**
	 * 获取解释元素所对应的数值
	 * @param key 解释元素
	 * @return 返回该解释元素所对应的数值
	 */
	public double getExpressionByKey(String key) {
		return expressions.get(key);
	}
}
