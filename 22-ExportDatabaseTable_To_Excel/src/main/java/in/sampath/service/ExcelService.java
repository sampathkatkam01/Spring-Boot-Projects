package in.sampath.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.sampath.Repo.ExcelRepo;
import in.sampath.entity.ExcelEntity;

@Service
public class ExcelService {
	@Autowired
	private ExcelRepo excelrepo;

	public void generateExceldata() throws IOException {
		List<ExcelEntity> data = excelrepo.findAll();
		//data.forEach(System.out::println);

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("PersonalData");
		XSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("Email");
		row.createCell(3).setCellValue("City");
		row.createCell(4).setCellValue("Salary");

		int RowNumber = 1;

		for (ExcelEntity Data : data) {
			XSSFRow datarow = sheet.createRow(RowNumber++);
			datarow.createCell(0).setCellValue(Data.getID());
			datarow.createCell(1).setCellValue(Data.getName());
			datarow.createCell(2).setCellValue(Data.getEmail());
			datarow.createCell(3).setCellValue(Data.getCity());
			datarow.createCell(4).setCellValue(Data.getSalary());
			RowNumber++;
		}
		
		FileOutputStream file = new FileOutputStream
				("D:\\Book1.xlsx");
		workbook.write(file);
		workbook.close();

	}

	public void save() {
		ExcelEntity EE = new ExcelEntity();
		EE.setEmail("satys2@gmail.com");
		EE.setName("satyaKarre");
		EE.setCity("ongol");
		EE.setSalary(84511.0);
		
		ExcelEntity EE1 = new ExcelEntity();
		EE1.setEmail("srinivas@gmail.com");
		EE1.setName("srinivas");
		EE1.setCity("karimnagar");
		EE1.setSalary(789456.0);
		
		ExcelEntity EE2 = new ExcelEntity();
		EE2.setEmail("pravenneelam@gmail.com");
		EE2.setName("neelampraveen");
		EE2.setCity("bhongir");
		EE2.setSalary(47851.0);
		
		ExcelEntity EE3 = new ExcelEntity();
		EE3.setEmail("harui32@gmail.com");
		EE3.setName("harivardhan");
		EE3.setCity("bhongir");
		EE3.setSalary(784512.0);
		
		List<ExcelEntity> asList = Arrays.asList(EE,EE1,EE2,EE3);

		excelrepo.saveAll(asList);
		System.out.println("Records Saved...........");
	}
}
