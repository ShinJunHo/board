package com.bit.board.http.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.http.action.Action;
import com.bit.http.HttpUtil;

public class JoinFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpUtil.forwarding(request, response, "/WEB-INF/views/user/joinform.jsp");
	}

}
