package com.csis3275.model_incredibles;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Incredible_mapper_gra_84 implements RowMapper<UserRegister> {
	
	public UserRegister mapRow(ResultSet resultSet, int i) throws SQLException	{
		UserRegister user = new UserRegister();
		
		user.setFirstName(resultSet.getString("firstName"));
		user.setLastName(resultSet.getString("lastName"));
		user.setEmail(resultSet.getString("email"));
		user.setPassword(resultSet.getString("password"));
		user.setPhoneNumber(resultSet.getString("phoneNumber"));
		
		return user;
		
	}
}
