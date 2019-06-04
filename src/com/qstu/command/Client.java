package com.qstu.command;

public class Client {

	public static void main(String[] args) {
		
		//创建接受者，也就是命令的执行者
		Receiver receiver = new Receiver();
		
		//创建需要添加的命令
		Command commandA = new CommandA(receiver);
		Command commandB = new CommandB(receiver);
		
		//创建调用者，对命令进行缓存，撤销，批处理等等
		Invoker invoker = new Invoker();
		//添加命令
		invoker.addCommandA(commandA);
		invoker.addCommandB(commandB);
		//执行命令
		invoker.commit();
	}

}
