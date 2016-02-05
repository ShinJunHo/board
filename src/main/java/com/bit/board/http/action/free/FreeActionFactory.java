package com.bit.board.http.action.free;

import com.bit.board.http.action.Action;
import com.bit.board.http.action.ActionFactory;

public class FreeActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		Action action=null;
		if("freelist".equals(actionName)){
			action = new FreeList();
		}
		
		return action;
	}

}
