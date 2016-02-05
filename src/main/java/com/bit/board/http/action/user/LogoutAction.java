package com.bit.board.http.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.board.http.action.Action;
import com.bit.http.HttpUtil;

public class LogoutAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(session == null){
			HttpUtil.redirect(response, "/board/main");
			return ;
		}
		session.removeAttribute("authUser");
		session.invalidate();
		HttpUtil.redirect(response, "/board/main");
	}
}
