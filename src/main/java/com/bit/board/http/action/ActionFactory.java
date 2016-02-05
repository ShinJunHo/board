package com.bit.board.http.action;

public abstract class ActionFactory {
	abstract public Action getAction(String actionName);
}
