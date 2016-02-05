package com.bit.board.http.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.dao.UserDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.UserVo;
import com.bit.http.HttpUtil;

public class JoinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String email =request.getParameter("EMAIL");
		String phone = request.getParameter("PHONE");
		String age = request.getParameter("AGE");
		
		UserVo vo = new UserVo();
		vo.setId(id);
		vo.setPassword(pw);
		vo.setEmail(email);
		vo.setPhone(phone);
		vo.setAge(Integer.parseInt(age));
		
		UserDao dao = new UserDao();
		dao.insert(vo);
		
		HttpUtil.redirect(response, "/board/main");
		
	}

}
