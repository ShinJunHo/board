package com.bit.board.http.action.noti;

import com.bit.board.http.action.Action;
import com.bit.board.http.action.ActionFactory;

public class NotiActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		Action action=null;
		
		if("notilist".equals(actionName)){
			action = new NotiList();
		}
		
		return action;
	}

}
