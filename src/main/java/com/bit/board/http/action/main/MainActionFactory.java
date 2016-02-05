package com.bit.board.http.action.main;

import com.bit.board.http.action.Action;
import com.bit.board.http.action.ActionFactory;

public class MainActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		Action action = new IndexAction();
		
		return action;
	}

}
