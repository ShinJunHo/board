package com.bit.board.http.action.anony;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.board.dao.BoardDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.BoardVo;
import com.bit.http.HttpUtil;

public class UpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String id = request.getParameter("id");
		int no = Integer.parseInt(request.getParameter("no"));
		//trim 해줘야지.
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setId(id);
		vo.setBoard_seq(no);
		System.out.println("BOARDVO:"+vo);
		BoardDao dao = new BoardDao();
		dao.update(vo);
		HttpUtil.redirect(response, "/board/anony");
	}

}
