package org.sp.app0717.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO2 {
	String url="jdbc:oracle:thin@:localhost:1521:XE";
	String user="java";
	String pass="1234";

	 public ResultSet selectAll() {
		 Connection con = null;
		 PreparedStatement pstmt=null;
		 ResultSet rs=null;
		 
		 //1) 드라이버 로드
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			//2) 접속
			con=DriverManager.getConnection(url,user,pass);
			if(con==null) {
				System.out.println("접속실패");
				
			}else {
				System.out.println("접속성공");
				
				//3) 쿼리수행
				String sql="select *from emp order by empno asc";
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
			}
			
			//4) 디비 해제
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return rs;
	 }
}
