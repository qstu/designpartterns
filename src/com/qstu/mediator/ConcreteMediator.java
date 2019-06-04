package com.qstu.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements IMediator {

	
	private Map<String, IColleague> colleagues = new HashMap<>();

	@Override
	public void register(String key, IColleague colleague) {
		this.colleagues.put(key, colleague);
		
	}

	@Override
	public void findColleagueToHelp(String colleaguebtag) {
		IColleague colleague = this.colleagues.get(colleaguebtag);
		if(colleague != null) {
			colleague.working();
		}else {
			System.out.println("there is no this colleague: " + colleaguebtag);
		}
		
	}
}
