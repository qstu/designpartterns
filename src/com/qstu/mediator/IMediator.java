package com.qstu.mediator;

public interface IMediator {
	
	/**
	 * 注册同事类
	 * @param key 同事tag，唯一标识
	 * @param colleague 同事
	 */
	void register(String key, IColleague colleague);

	/**
	 * 让对应的同事帮忙
	 * @param colleaguebtag 同事tag
	 */
	void findColleagueToHelp(String colleaguebtag);

}
