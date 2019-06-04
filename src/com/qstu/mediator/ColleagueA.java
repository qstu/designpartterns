package com.qstu.mediator;

public class ColleagueA implements IColleague{


	private IMediator iMediator;

	public ColleagueA(IMediator iMediator) {
		super();
		this.iMediator = iMediator;
		this.iMediator.register(ColleagueATag, this);
	}

	@Override
	public void working() {
		System.out.println("doing A work！！！");
		
	}

	@Override
	public void needHelp() {
		System.out.println("I`m A, I need help！！！");
		this.iMediator.findColleagueToHelp(ColleagueBTag);
	}
	
	
}
