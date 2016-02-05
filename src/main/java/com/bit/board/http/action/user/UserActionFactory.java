package com.bit.board.http.action.user;

import com.bit.board.http.action.Action;
import com.bit.board.http.action.ActionFactory;
import com.bit.board.http.action.main.IndexAction;

public class UserActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		Action action = null;
		
		if("joinform".equals(actionName)){
			action = new JoinFormAction();
		}else if("join".equals(actionName)){
			action = new JoinAction();
		}else if("loginform".equals(actionName)){
			action = new LoginFormAction();
		}else if("login".equals(actionName)){
			action = new LoginAction();
		}else if("logout".equals(actionName)){
			action = new LogoutAction();
		}else{
			action = new IndexAction();
		}
		
		
		return action;
	}

}
