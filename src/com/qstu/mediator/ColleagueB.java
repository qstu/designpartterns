package com.qstu.mediator;

public class ColleagueB implements IColleague {

	private IMediator iMediator;
	

	public ColleagueB(IMediator iMediator) {
		super();
		this.iMediator = iMediator;
		this.iMediator.register(ColleagueBTag, this);
	}


	@Override
	public void working() {
		System.out.println("doing B work！！！");
	}


	@Override
	public void needHelp() {
		System.out.println("I`m B, I need help！！！");
		this.iMediator.findColleagueToHelp(ColleagueATag);
	}
	
	
}
