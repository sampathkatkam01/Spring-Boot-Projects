package in.sampath.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class employeeobj {
 

	public static void main(String[] args) throws IOException  {
		
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<employee> list = new ArrayList<employee>();
		employee emp = new employee(101, "sampathKatkam");
		list.add(emp);
		employee e2 = new employee(104, "srinivas");
		list.add(e2);
		employee e3 = new employee(105, "hari");
		list.add(e3);
		employee e4 = new employee(107, "suryakumar");
		list.add(e4);

		String jsondata = mapper.writeValueAsString(list);
		System.out.println(jsondata);
		
		
		
		File file =new File("data.json");
		mapper.writeValue(file, list);
		
		
		
		
		System.out.println("List stored in file ");
	}
    }

