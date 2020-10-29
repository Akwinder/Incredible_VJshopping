package com.csis3275.model_incredibles;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Incredibles_mapper_vka_86 implements RowMapper<Home_vka_86> {
	public Home_vka_86 mapRow(ResultSet resultSet, int i) throws SQLException {

		Home_vka_86 custProblem = new Home_vka_86();
		custProblem.setName(resultSet.getString("name"));
		custProblem.setEmail(resultSet.getString("email"));
		custProblem.setSubject(resultSet.getNString("subject"));
		custProblem.setMessage(resultSet.getNString("message"));

		return custProblem;

	}

}
