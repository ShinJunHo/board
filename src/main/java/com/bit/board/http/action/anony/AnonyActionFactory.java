package com.bit.board.http.action.anony;

import com.bit.board.http.action.Action;
import com.bit.board.http.action.ActionFactory;

public class AnonyActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		Action action = null;
		
		if("anonylist".equals(actionName)){
			action = new AnonyList();
		}else if("insert".equals(actionName)){
			action = new InsertAction();
		}else if("view".equals(actionName)){
			action = new ListView();
		}else if("write".equals(actionName)){
			action = new WriteView();
		}else if("modify".equals(actionName)){
			action =new ModifyView();
		}else if("update".equals(actionName)){
			action = new UpdateAction();
		}else if("delete".equals(actionName)){
			action = new DeleteAction();
		}else{
			action = new AnonyList();
		}
		
		return action;
	}

}
