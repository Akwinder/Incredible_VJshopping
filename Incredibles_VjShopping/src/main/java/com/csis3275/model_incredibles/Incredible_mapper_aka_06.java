package com.csis3275.model_incredibles;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class Incredible_mapper_aka_06 implements RowMapper<Register> {
	
	public Register mapRow(ResultSet resultSet, int i) throws SQLException	{
		
		Register admin = new Register();
		admin.setFirstName(resultSet.getString("firstName"));
		admin.setLastName(resultSet.getString("lastName"));
		admin.setEmail(resultSet.getString("email"));
		admin.setPassword(resultSet.getString("password"));
		admin.setPhoneNumber(resultSet.getString("phoneNumber"));
		
		return admin;
		
	}

}
