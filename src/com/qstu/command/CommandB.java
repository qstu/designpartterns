package com.qstu.command;

public class CommandB implements Command {
	
	private Receiver receiver;

	public CommandB(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void action() {
		//调用执行动作B
		this.receiver.doingB();
	}

}
