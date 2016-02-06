package com.bit.board.http.action.noti;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.dao.BoardDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.BoardVo;
import com.bit.http.HttpUtil;

public class NotiList implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String result = request.getParameter("result");
		BoardDao dao = new BoardDao();
		String boardCode = "Noti";
		List<BoardVo> list = dao.getList(boardCode);
		
		request.setAttribute("result", result);
		request.setAttribute("list",list);
		HttpUtil.forwarding(request, response, "/WEB-INF/views/notificationboard/list.jsp");
	}

}
