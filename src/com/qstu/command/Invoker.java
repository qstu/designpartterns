package com.qstu.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<Command> commands;
	
	public Invoker() {
		super();
		commands = new ArrayList<Command>();
	}

	/**
	 * 添加命令A
	 * @param commandA 命令A
	 */
	public void addCommandA(Command commandA) {
		this.commands.add(commandA);
	}

	/**
	 * 添加命令B 虽然addCom mandA 与 addCommandB看上去相同
	 * 如果没有特殊操作可以将这两个命令合并，如果不同命令在添加时
	 * 有额外特别操作需单独放置。
	 * 当然，事例代码是将 addCommandA 和 addCommandA 可以合并的
	 * @param commandB 命令B
	 */
	public void addCommandB(Command commandB) {
		this.commands.add(commandB);
	}

	/**
	 * 命令添加完毕，执行代码
	 */
	public void commit() {
		for (Command command : commands) {
			command.action();
		}
	}

}
