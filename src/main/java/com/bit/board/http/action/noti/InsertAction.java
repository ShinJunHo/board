package com.bit.board.http.action.noti;

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
		String content =request.getParameter("content");
		HttpSession session = request.getSession();
		UserVo uvo = (UserVo)session.getAttribute("authUser");
		String id = uvo.getId();
		String boardName = request.getParameter("boardname");
		
		if(title.trim().length() == 0 || content.trim().length() == 0){
			HttpUtil.redirect(response, "/board/noti?result=fail");
			return ;
		}
		
		
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setId(id);
		
		vo.setBoard_name(boardName);
		System.out.println(vo);
		BoardDao dao = new BoardDao();
		dao.insert(vo);
		HttpUtil.redirect(response, "/board/noti");
		
		
	}

}
