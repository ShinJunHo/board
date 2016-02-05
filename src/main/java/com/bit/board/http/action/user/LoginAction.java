package com.bit.board.http.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.board.dao.UserDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.UserVo;
import com.bit.http.HttpUtil;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("loginID");
		String password =request.getParameter("loginPW");
		
		UserDao dao = new UserDao();
		UserVo vo = dao.get(id, password);
		if(vo == null){
			HttpUtil.redirect(response, "/board/user?a=loginform&result=fail");
			return ;
		}
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", vo);
		HttpUtil.redirect(response, "/board/main");
	}

}
