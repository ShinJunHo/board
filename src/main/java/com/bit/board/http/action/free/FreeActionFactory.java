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
		}else if("insert".equals(actionName)){
			action = new InsertAction();
		}else if("view".equals(actionName)){
			action = new ViewAction();
		}else if("write".equals(actionName)){
			action = new WriteAction();
		}else if("modify".equals(actionName)){
			action = new ModifyAction();
		}else if("update".equals(actionName)){
			action = new UpdateAction();
		}else if("delete".equals(actionName)){
			action = new DeleteAction();
		}else {
			action = new FreeList();
		}
		
		return action;
	}

}
