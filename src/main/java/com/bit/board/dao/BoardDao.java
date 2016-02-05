package com.bit.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.board.vo.BoardVo;

public class BoardDao {

	private Connection getConnection() throws SQLException {

		Connection connection = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection(dbURL, "webdb", "webdb");
		} catch (ClassNotFoundException ex) {
			System.out.println("드라이버로드실패 = " + ex);
		}
		return connection;
	}
	public List<BoardVo> getList(){
		List<BoardVo> list = new ArrayList<BoardVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		BoardVo vo = null;
		try{
			conn = getConnection();
			String sql ="select seq,user_id,title,contents,board_name,modifydate from tb_board";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int no = rs.getInt(1);
				String uid = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				String boardName = rs.getString(5);
				String modifyDate = rs.getString(6);
				
				
				vo = new BoardVo();
				vo.setBoard_seq(no);
				vo.setId(uid);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setBoard_name(boardName);
				vo.setModi_date(modifyDate);
				list.add(vo);
			}
			
		}catch(SQLException ex){
			System.out.println("SQL Error: "+ ex);
		}finally{
			try{
				if(rs!=null){
					rs.close();
				}
				if(pstmt !=null){
					pstmt.close();
				}
				if(conn!= null){
					conn.close();
				}
			}catch( SQLException ex){
				ex.printStackTrace();
			}
		}
		
		
		return list;
	}
	public void insert(BoardVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			System.out.println("BOARD VO : "+vo);
			String sql = "insert into tb_board";
			
			switch (vo.getBoard_name()) {
			case "Anony":
				sql +=" values(BOARD_SEQ.nextval,'Anony',?,?,?,sysdate)";
				System.out.println("SQL::"+sql);
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vo.getTitle());
				pstmt.setString(2, vo.getContent());
				pstmt.setString(3, vo.getBoard_name());
				break;
			case "Free":
				sql +=" values(BOARD_SEQ.nextval,?,?,?,?,sysdate)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vo.getId());
				pstmt.setString(2, vo.getTitle());
				pstmt.setString(3, vo.getContent());
				pstmt.setString(4, vo.getBoard_name());
				break;
			case "Noti":
				sql +=" values(BOARD_SEQ.nextval,'Manager',?,?,?,sysdate)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vo.getTitle());
				pstmt.setString(2, vo.getContent());
				pstmt.setString(3, vo.getBoard_name());
				break;
			default:
				break;
			}
			pstmt.executeUpdate();
			
		} catch (SQLException ex) {
			System.out.println("sql Error: "+ex);
			ex.printStackTrace();
		} finally {
			try{
				if(pstmt !=null){
					pstmt.close();
				}
				if(conn != null){
					conn.close();
				}
				}catch(SQLException ex){
					ex.printStackTrace();
				}
		}
	}
	public BoardVo getView(int no){
		BoardVo viewVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = getConnection();
			String sql ="select seq,user_id, title, contents, board_name from tb_board where seq = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			
			rs = pstmt.executeQuery();
			if(rs.next()){
				int seq = rs.getInt(1);
				String bid = rs.getString(2);
				String btitle = rs.getString(3);
				String bcontent = rs.getString(4);
				String bboardName = rs.getString(5);
				
				viewVo = new BoardVo();
				viewVo.setBoard_seq(seq);
				viewVo.setId(bid);
				viewVo.setTitle(btitle);
				viewVo.setContent(bcontent);
				viewVo.setBoard_name(bboardName);
				
			}
		}catch(SQLException ex){
			System.out.println("SQL Error : "+ex);
		}finally{
			
		}
		return viewVo;
	}
	public void update(BoardVo vo){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			conn = getConnection();
			
			String sql = "update tb_board set title = ?, contents = ? where seq = ?";
			pstmt =conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getBoard_seq());
			
			pstmt.executeUpdate();
		}catch(SQLException ex){
			System.out.println("sql Error: "+ex);
			ex.printStackTrace();
		}finally{
			try{
			if(pstmt !=null){
				pstmt.close();
			}
			if(conn != null){
				conn.close();
			}
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
		
	}
}
