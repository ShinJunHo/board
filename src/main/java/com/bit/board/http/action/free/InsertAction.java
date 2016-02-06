package com.bit.board.http.action.free;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.board.dao.BoardDao;
import com.bit.board.http.action.Action;
import com.bit.board.vo.BoardVo;
import com.bit.board.vo.UserVo;
import com.bit.http.HttpUtil;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		HttpSession session = request.getSession();
		UserVo uvo = (UserVo)session.getAttribute("authUser");
		String id = uvo.getId();
		String boardName = request.getParameter("boardname");
		
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setId(id);
		vo.setBoard_name(boardName);
		
		BoardDao dao = new BoardDao();
		dao.insert(vo);
		//이렇게 해놓고 a태그가 없어서 free action factory에서 default로 갈 페이지가 없었다.
		HttpUtil.redirect(response, "/board/free");
	}

}
