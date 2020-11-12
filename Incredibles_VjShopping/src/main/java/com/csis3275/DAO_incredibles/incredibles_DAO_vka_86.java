package com.csis3275.DAO_incredibles;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.csis3275.model_incredibles.Home_vka_86;
import com.csis3275.model_incredibles.Incredibles_mapper_vka_86;

@Component
public class incredibles_DAO_vka_86 {
	JdbcTemplate jdbcTemplate;

	private final String SQL_GET_ALL = "select * from custProblem";
	private final String SQL_INSERT_Problem = "insert into custProblem(name,email,subject,message) values(?,?,?,?)";

	@Autowired
	public incredibles_DAO_vka_86(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Home_vka_86> getAllProblem() {
		return jdbcTemplate.query(SQL_GET_ALL, new Incredibles_mapper_vka_86());
	}

	public boolean createQuaries(Home_vka_86 custProblem) {
		return jdbcTemplate.update(SQL_INSERT_Problem, custProblem.getName(), custProblem.getEmail(),
				custProblem.getSubject(), custProblem.getMessage()) > 0;
	}

}
