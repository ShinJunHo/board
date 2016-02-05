package com.bit.board.http.action.anony;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.dao.BoardDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.BoardVo;
import com.bit.http.HttpUtil;

public class ModifyView implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		int no = Integer.parseInt(request.getParameter("no"));
		BoardVo vo = dao.getView(no);
		request.setAttribute("board", vo);
		
		HttpUtil.forwarding(request, response, "/WEB-INF/views/anonymousboard/modify.jsp");
	}

}
