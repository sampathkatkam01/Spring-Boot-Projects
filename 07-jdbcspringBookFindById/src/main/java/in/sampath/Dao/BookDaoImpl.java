package in.sampath.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements BookDao {

	private JdbcTemplate jdbctemplate;
	
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	@Override
	public boolean FindById() {
		
		String sql="select BookId from Book ";
		jdbctemplate.execute(sql);
		return true;
	}

}
