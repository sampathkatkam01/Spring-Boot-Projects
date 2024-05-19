package in.sampath.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class Deleteimpl implements DeleteDao {

	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public boolean delete() {

		String sql = "delete from Book where BookId=102";
		jdbctemplate.execute(sql);
		return true;
	}

}
