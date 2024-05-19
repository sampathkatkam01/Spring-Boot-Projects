package in.sampath.Book;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookUpdateimpl implements BookupdateDao {

	
	 private JdbcTemplate jdbcTemplete;
	 
	 
		public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}


	@Override
	public boolean update() {
		String sql="update Book set BookId=101 where BookName='java'";
		jdbcTemplete.execute(sql);
		
		return true;
	}

}
