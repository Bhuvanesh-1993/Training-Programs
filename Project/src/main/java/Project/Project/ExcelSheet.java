package Project.Project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet
{
	static Scanner sc = new Scanner(System.in);
	static String name = "", Department = "";
	static int m1 = 0, e1 = 0, j2 = 0, j1 = 0, n1 = 0, sm = 0, Total = 0;
	static double per = 0.0;
	//Creating work sheet
	static Workbook workbook = new XSSFWorkbook();
	static Sheet sheet = workbook.createSheet("Student Details");
	//Font object creation
	static Font font = workbook.createFont();
	static Row dataRow ;
	
	public static void main(String[] args) throws IOException 
	{
		//Excel file creating
		File file = new File("‎⁨Student.xlsx");
		file.createNewFile();
		//creating row
	    Row header = sheet.createRow(0);
	    CellStyle style = workbook.createCellStyle();
	    //Apply color
	    style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        font.setBold(true);
        style.setFont(font);
        //creating cell
        Cell cell = header.createCell(0); 
        cell.setCellValue("Roll No");
        cell.setCellStyle(style);
       
        cell = header.createCell(1);  
        cell.setCellValue("Name"); 
        cell.setCellStyle(style);  
        
        cell = header.createCell(2);  
        cell.setCellValue("Dept Name"); 
        cell.setCellStyle(style); 
        
        cell = header.createCell(3);  
        cell.setCellValue("Subjects"); 
        style.setAlignment(HorizontalAlignment.CENTER);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 3, 6));
        cell.setCellStyle(style); 
        
        cell = header.createCell(8);  
        cell.setCellValue("Total Marks"); 
        cell.setCellStyle(style); 
        
        cell = header.createCell(9);  
        cell.setCellValue("Percentage"); 
        cell.setCellStyle(style);  
        
	    
	    Row header1 = sheet.createRow(1);
	    CellStyle style1 = workbook.createCellStyle();
	    font.setBold(true);
        style1.setFont(font);
        
        Cell cell1 = header1.createCell(3);
        cell1.setCellValue("Maths");
        cell1.setCellStyle(style1);
        
        cell1 = header1.createCell(4);
        cell1.setCellValue("English");
        cell1.setCellStyle(style1);
        
        cell1 = header1.createCell(5);
        cell1.setCellValue("StrengthOfMaterial");
        cell1.setCellStyle(style1);
        
        cell1 = header1.createCell(6);
        cell1.setCellValue("Java");
        cell1.setCellStyle(style1);
        
        cell1 = header1.createCell(7);
        cell1.setCellValue("Networks");
        cell1.setCellStyle(style1);
        
	    
	    int row = 2;
	    System.out.println("How much student details your enter :");
		int t = sc.nextInt();
	    for(int i=1;i<=t;i++)
		{
			int Rno = i;
		    stu_details();

		    dataRow = sheet.createRow(row);
		    dataRow.createCell(0).setCellValue(Rno);
		    dataRow.createCell(1).setCellValue(name);
		    dataRow.createCell(2).setCellValue(Department);
		    
		    pass(m1,row,3);
		    pass(e1,row,4);
		    pass(sm,row,5);
		    
		    if("IT".equalsIgnoreCase(Department)) {
		    	pass(j1,row,6);
		        pass(j2,row,7);
		        dataRow.createCell(6).setCellValue("-");
		    }
			else
			    dataRow.createCell(6).setCellValue("-");
		        dataRow.createCell(7).setCellValue("-");
		   
		    dataRow.createCell(8).setCellValue(Total);
		    dataRow.createCell(9).setCellValue(per+"%");
		    row++;
		}
	    System.out.println("Thank You......");
	    try
	    {
	        FileOutputStream out =  new FileOutputStream(file);
	        workbook.write(out);
	        out.close();
	    } 
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    workbook.close();
	    
	}
	
   	//Mark is below 45 means print mark in red color
   	static void pass(int mark,int row,int col) 
   	{
		if(mark>=45)
   			dataRow.createCell(col).setCellValue(mark);
   		else
   		{
			CellStyle style1 = workbook.createCellStyle();
		    Cell cell = dataRow.createCell(col); 
		    Font font1 = workbook.createFont();
		    font1.setColor(IndexedColors.RED.getIndex());
		    style1.setFont(font1);
		    
	        cell.setCellValue(mark);
	        cell.setCellStyle(style1);
   	   	}
	}
	//User to get the input details
	static void stu_details() {
		System.out.println("Enter the Student Name :");
		name = sc.next();
		System.out.println("Enter the Department Name :");
		Department = sc.next();
		check_dept(Department);
	}
	//User to get the Department
	static void check_dept(String d_name)	{
		String Dept1 = "Mech";
		String Dept2 = "IT";
		
		if(d_name.equalsIgnoreCase(Dept1))
			mech_department();
		else if(d_name.equalsIgnoreCase(Dept2))
			IT_Department();
		else
		{
			System.out.println("Please enter valid Department Name");
			Department = sc.next();
			check_dept(Department);
		}
	}
	//User to got Department CSE means then Collect Subject wise Mark
	static void mech_department() {
		System.out.println("Enter the Maths Mark :");
		m1 = sc.nextInt();
		System.out.println("Enter the English Mark :");
		e1 = sc.nextInt();
		System.out.println("Enter the Strength Of MAterial Mark :");
		sm = sc.nextInt();
		j1 = 0;
		j2 = 0;
		total_marks(m1,e1,sm);
	}
	//Add the Marks and calculate percentage
	static void total_marks(int m1, int e1, int sm) {
		Total = m1 + e1 + sm;
		per = Total/3;
	}
	//User to got Department IT means then Collect Subject wise Mark
	static void IT_Department() {
		System.out.println("Enter the Maths Mark :");
		m1 = sc.nextInt();
		System.out.println("Enter the English Mark :");
		e1 = sc.nextInt();
		System.out.println("Enter the Java Mark :");
		j1 = sc.nextInt();
		System.out.println("Enter the Networks Mark :");
		n1 = sc.nextInt();
		sm = 0;
		
		total_marks(m1,e1,j1,n1);
	}
	//Add the Marks and calculate percentage
	static void total_marks(int m2, int e2, int j2, int n1) {
		Total = m2 + e2 + j2+ n1;
		per = Total/4;
	}
	
}