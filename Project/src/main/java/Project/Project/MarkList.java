package Project.Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MarkList {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.out.println("Enter the no of Students");
int num = sc.nextInt();
while(num>0) {
System.out.println("Enter the name of the students");
String name = sc.next(); 
System.out.println("Enter the department name");
String s = sc.next();
getmarks(s);
num--;
}

Workbook workbook = new XSSFWorkbook();
Sheet sheet = workbook.createSheet("Contacts");

FileOutputStream fileout = new FileOutputStream("Contacts.xlsx");
workbook.write(fileout);
	}
	public static void getmarks(String s) 
	{
		if(s.equalsIgnoreCase("Mech")) {
			System.out.println("Enter the Strength Of Material Marks");
			int StrengthOfMaterial = sc.nextInt();
			System.out.println("Enter the Thermo Dynamics Marks");
			int ThermoDynamics = sc.nextInt();
			System.out.println("Enter the Manufacturing Technology Marks");
			int ManufacturingTechnology = sc.nextInt();
		              }
		else if(s.equalsIgnoreCase("IT"))  {
			System.out.println("Enter the NetWorks Marks");
			int NetWorks = sc.nextInt();
			System.out.println("Enter the Java Marks");
			int Java = sc.nextInt();
			System.out.println("Enter the OOPS Marks");
			int OOPS = sc.nextInt();
			System.out.println("Enter the C-Program Marks");
			int ManufacturingTechnology = sc.nextInt();
		     		}
		else {
			System.out.println("Enter the Valid Department Name");
		}
	}
}

