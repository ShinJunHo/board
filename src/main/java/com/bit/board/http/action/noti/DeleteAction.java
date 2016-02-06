package com.bit.board.http.action.noti;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.dao.BoardDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.BoardVo;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(request.getParameter("no"));
		BoardVo vo = new BoardVo();
		vo.setBoard_seq(no);
		
		BoardDao dao = new BoardDao();
		dao.delete(vo);
		response.sendRedirect("/board/noti");
	}

}
