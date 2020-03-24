package com.cognizant.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cognizant.model.Student;



public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemplate;
	
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int insert(int id, String name) {
		
		String sql = "insert into login values(?,?)";
		int update = jdbctemplate.update(sql, id, name);
		System.out.println("Records Insertion " + update);
		return update;

	}

	public int delete(int id) {

		String sql = "delete from login where id=?";
		int update = jdbctemplate.update(sql, id);
		System.out.println("Records Deletion " + update);
		return update;

	}

	public int update(int id, String name) {

		String sql = "update login set name=? where id=?";
		int value = jdbctemplate.update(sql, name, id);
		return value;

	}
	
	public List<Student> getall()
	{
		String sql = "select * from login";
		Studentrowmapper rmp = new Studentrowmapper();
		List<Student> students = jdbctemplate.query(sql, rmp);
		return students;
	}
	

}
