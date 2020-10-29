package com.csis3275.DAO_incredibles;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.csis3275.model_incredibles.Incredible_mapper_gra_84;

import com.csis3275.model_incredibles.UserRegister;

@Component
public class incredible_DOA_gra_84 {
	JdbcTemplate jdbcTemplate;
	 
	private final String SQL_GET_ALL = "select * from userregistration";
	private final String SQL_INSERT_Admin = "insert into userregistration(firstname, lastname,email,password,phoneNumber) values(?,?,?,?,?)";
	private final String FIND_USER = "select * from userregistration where email=? and pass=?";
	//private final String sql = "SELECT email,password FROM REGISTRATION";
	
	@Autowired
	public incredible_DOA_gra_84(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<UserRegister> getAllAdmin() {
		return jdbcTemplate.query(SQL_GET_ALL, new Incredible_mapper_gra_84());
	}

	public boolean createNewAdmin(UserRegister newAdmin) {
		return jdbcTemplate.update(SQL_INSERT_Admin, newAdmin.getFirstName(), newAdmin.getLastName(), newAdmin.getEmail(),
				newAdmin.getPassword(), newAdmin.getPhoneNumber()) > 0;
	}
	
	public boolean authenticateUser(String userName,String password)
	     {try {
	         String userNameDB = (String) jdbcTemplate.queryForObject(
	        		 "SELECT email FROM userREGISTRATION WHERE email ="+"'"+userName+"'", new Object[] {}, String.class);
	         String passwordDB = (String) jdbcTemplate.queryForObject(
	        		 "SELECT TOP 1 password FROM userREGISTRATION WHERE password ="+"'"+password+"'", new Object[] {}, String.class);
	         if(userName.equals(userNameDB) && password.equals(passwordDB)){
			      return true;
			      }
			   else {
	             return false;}}
	         catch (EmptyResultDataAccessException e) {
	                e.printStackTrace();
	            }
	     return false;
	        
	     }

}
