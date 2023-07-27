package org.sp.app0717.controller;

import java.sql.ResultSet;

import javax.swing.table.AbstractTableModel;

import org.sp.app0717.model.EmpDAO;

public class MyTableModel extends AbstractTableModel {
	EmpDAO empDAO2;
	
	public MyTableModel() {
		empDAO2 = new EmpDAO();
		
		//사원 정보 가져오기
		//ResultSet rs=empDAO2.selectAll();
	}
	
	public int getRowCount() {
		return 3;
	}

	public int getColumnCount() {
		return 5;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return "사과";
	}

}
