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
		}else if("write".equals(actionName)){
			action = new WriteAction();
		}else if("insert".equals(actionName)){
			action = new InsertAction();
		}else if("view".equals(actionName)){
			action = new ViewAction();
		}else if("modify".equals(actionName)){
			action = new ModifyAction();
		}else if("update".equals(actionName)){
			action = new UpdateAction();
		}else if("delete".equals(actionName)){
			action = new DeleteAction();
		}else{
			action = new NotiList();
		}
		
		return action;
	}

}
