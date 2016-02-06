package com.bit.board.http.action.noti;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.dao.BoardDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.BoardVo;
import com.bit.http.HttpUtil;

public class ModifyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = new BoardDao();
		BoardVo vo = dao.getView(no);
		
		request.setAttribute("board", vo);
		HttpUtil.forwarding(request, response, "/WEB-INF/views/notificationboard/modify.jsp");
	}

}
