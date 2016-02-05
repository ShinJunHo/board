package com.bit.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.board.vo.UserVo;

public class UserDao {
	private Connection getConnection()throws SQLException{
		Connection connection = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection( dbURL, "webdb", "webdb" );
		}catch(ClassNotFoundException ex){
			System.out.println("드라이버 로딩 실패: "+ex);
		}
		return connection;
	}
	
	public UserVo get(String id, String password){
		Connection conn =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		UserVo vo = null;
		
		try{
			conn = getConnection();
			String sql ="select SEQ, USER_ID, EMAIL, PHONE, AGE from TB_USER where USER_ID =? and PASSWORD = ?";
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			if(rs.next()){
				int u_no = rs.getInt(1);
				String u_id = rs.getString(2);
				String u_email = rs.getString(3);
				String u_phone = rs.getString(4);
				int u_age = rs.getInt(5);
				
				vo = new UserVo();
				vo.setNo(u_no);
				vo.setId(u_id);
				vo.setEmail(u_email);
				vo.setPhone(u_phone);
				vo.setAge(u_age);
				
			}
		}catch(SQLException ex){
			System.out.println( "SQL Error:" + ex );
		}finally{
			try{
				if( rs != null ) {
					rs.close();
				}
				if( pstmt != null ) {
					pstmt.close();
				}
				if( conn != null ) {
					conn.close();
				}
			} catch( SQLException ex ) {
				ex.printStackTrace();
			}
		}
		return vo;
		
	}
	
	public void insert(UserVo vo){
		Connection conn = null;
		PreparedStatement pstmt =null;
		try{
			conn = getConnection();
			String sql ="insert into tb_user values(user_seq.nextval,?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getPhone());
			pstmt.setInt(5, vo.getAge());
			pstmt.executeUpdate();
		}catch(SQLException ex){
			System.out.println("SQL ERROR :" +ex);
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
