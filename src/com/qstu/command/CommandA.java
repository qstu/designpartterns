package com.qstu.command;

public class CommandA implements Command {
	
	private Receiver receiver;

	public CommandA(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void action() {
		//调用执行动作A
		this.receiver.doingA();
	}

}
