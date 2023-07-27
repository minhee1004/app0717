package org.sp.app0717.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.sp.app0717.controller.MyTableModel;

public class TableApp2 extends JFrame {
	JPanel p_north;
	JButton bt_emp;
	JButton bt_dept;
	JTable table;
	JScrollPane scroll;
	MyTableModel model;

	public TableApp2() {
		p_north = new JPanel();
		bt_emp = new JButton("사원");
		bt_dept = new JButton("부서");
		
		model = new MyTableModel();
		table = new JTable(model);
		scroll = new JScrollPane(table);
		
		p_north.add(bt_emp);
		p_north.add(bt_dept);
		
		add(p_north,BorderLayout.NORTH);
		add(scroll);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TableApp2();
	}
}
