package com.bit.board.http.action.anony;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.dao.BoardDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.BoardVo;
import com.bit.http.HttpUtil;

public class AnonyList implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BoardDao dao = new BoardDao();
		List<BoardVo> list  = dao.getList();
		
		request.setAttribute("list", list);
		HttpUtil.forwarding(request, response, "/WEB-INF/views/anonymousboard/list.jsp");
	}

}
