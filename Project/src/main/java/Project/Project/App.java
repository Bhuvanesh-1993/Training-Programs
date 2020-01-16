package Project.Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * Hello world!
 *
 */
public class App 
{
	private static String[] columns = {"First Name","Last Name","Email","Date of Birth"};
	private static List<Contact> list = new ArrayList<Contact>();
	public static void main(String[] args) throws IOException
	{
		list.add(new Contact("Bhuvanesh","k","bhuvanesh998@","24-09-1993"));
		list.add(new Contact("Mari","k","Marimuthu1995@","28-05-1995"));
		list.add(new Contact("Mohan","R","MohanMIT@","24-11-1997"));
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Contacts");

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 15);
		headerFont.setColor(IndexedColors.RED.getIndex());
		
		CellStyle headercellstyle =  workbook.createCellStyle();
		headercellstyle.setFont(headerFont);
		
		Row headerrow = sheet.createRow(0);
		
		for(int i=0;i<columns.length;i++){
			Cell cell = headerrow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headercellstyle);
		}
		  int rowNum = 1;
		  
		  for(Contact contact:list) {
			  Row row = sheet.createRow(rowNum++);
			  row.createCell(0).setCellValue(contact.FirstName);
			  row.createCell(1).setCellValue(contact.LastName);
			  row.createCell(2).setCellValue(contact.Email);
			  row.createCell(3).setCellValue(contact.DateofBirth);  		  
		  }
		  
		  for(int i=0;i<columns.length;i++) {
			  sheet.autoSizeColumn(i);
		  }
		  
		  FileOutputStream fileout = new FileOutputStream("Contacts.xlsx");
		  workbook.write(fileout);
		  fileout.close();
		  workbook.close();
	}
}