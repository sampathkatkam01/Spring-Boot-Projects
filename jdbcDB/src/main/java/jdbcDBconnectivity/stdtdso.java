package jdbcDBconnectivity;


	import javax.sql.DataSource;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.stereotype.Repository;

	@Repository
	public class stdtdso {
	    
	    private JdbcTemplate jdbcTemplate;

	    @Autowired
	    public void setDataSource(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	    }

	    public int insertStudent(Student student) {
	        String sql = "INSERT INTO student (name, age, grade) VALUES (?, ?, ?)";
	        return jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getGrade());
	    }

	    public static class Student {
	        private String name;
	        private int age;
	        private String grade;

	        public Student(String name, int age, String grade) {
	            this.name = name;
	            this.age = age;
	            this.grade = grade;
	        }

	        public String getName() {
	            return name;
	        }

	        public int getAge() {
	            return age;
	        }

	        public String getGrade() {
	            return grade;
	        }
	    }
	}

}
