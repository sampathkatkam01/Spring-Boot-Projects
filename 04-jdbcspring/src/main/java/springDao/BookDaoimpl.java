package springDao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoimpl implements BookDao {

	private JdbcTemplate jdbcTemplete;

	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}


	@Override
	public boolean Save() {

		String sql = "insert into book values(101,'java',4512.00)";

		jdbcTemplete.execute(sql);

		return true;
	}

}
