package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PayService {
	FileReader fread = new FileReader("C:\\Users\\alago\OneDrive\\Desktop\School\\L2\\JavaDev\\students.csv");
	BufferedReader br = new BufferedReader(fread);
	String read = "";
	List<String> students = new ArrayList<String>();
	
	int count = 0;
	if(count != 0) {
		while(line = br.readLine()) != null) {
			if(count !=0) {
				String[] studentList = line.split(splitBy);
				student.setStudId(studentList[0].trim());
				student.setName(studentList[1].trim());
				student.setDepartment(studentList[2].trim());
				String age = studentList[4].trim();
				
				age = (!age.contains("") && Integer.valueOf(studentList[4].trim()) >= 19)? studentList[4].trim(): String.valueOf(0);
				student.setAge(age);
				String CSV = studentList[3].trim();
				String[] values = CSV.split(";");
				//system.out.print(Arrays
				student.setCourse(Arrays.asList(values));
				student.setYear(studentList[5].trim());
				student.setFee(Double.parseDouble(studentList[6].trim()));
				student.setPaid(studentList[7].trim());
				
				//Add the student(Object) to the students(List)
				students.add(student);
				
				
			}
			count ++;
		}
	}
	br.close();
	fread.close();
	
} catch (IOException ex) {
	ex.printStackTrace();
}
