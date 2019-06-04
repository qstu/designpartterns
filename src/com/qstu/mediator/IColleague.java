package com.qstu.mediator;

public interface IColleague {
	
	
	String ColleagueATag = "ColleagueATag";
	
	String ColleagueBTag = "ColleagueBTag";
	
	/**
	 * 完成自己能做的工作
	 */
	void working();
	
	/**
	 * 需要别的同时帮忙
	 */
	void needHelp();

}
