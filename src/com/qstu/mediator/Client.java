package com.qstu.mediator;

public class Client {

	public static void main(String[] args) {

		IMediator iMediator = new ConcreteMediator();
		IColleague colleagueA = new ColleagueA(iMediator);
		IColleague colleagueB = new ColleagueB(iMediator);
		
		colleagueA.needHelp();
	}

}
