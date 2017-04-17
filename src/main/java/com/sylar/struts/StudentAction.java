package com.sylar.struts;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tutorialspoint.Student;
import com.tutorialspoint.StudentDAO;

public class StudentAction extends ActionSupport{

	private List<Student> list;
	
	private StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public String execute() {

        return SUCCESS;
    }
	public String newStudent() {
		System.out.println("*****************6666");
		return SUCCESS;
		
	}
	
	public String listStudents() {
		System.out.println("*****************7777");

		list = studentDAO.listStudents();
		System.out.println("**************"+list.size());
        return SUCCESS;
		
	}


	
}
