package excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\mahes\\OneDrive\\Desktop\\mahesh.xlsx");
		
		FileInputStream fin=new FileInputStream(f);

		try (XSSFWorkbook work = new XSSFWorkbook(fin)) {
			XSSFSheet sheet=work.getSheet("mahesh");
			String x = sheet.getRow(6).getCell(1).getStringCellValue();
			String y = sheet.getRow(6).getCell(2).getStringCellValue();
			
			
			int z =(int) sheet.getRow(6).getCell(3).getNumericCellValue();
			System.out.println(x+":"+y+":"+z);
		int n=	sheet.getRow(0).getLastCellNum();
		//System.out.println(n);
		for(int i=0;i<n;i++) 
		{
			System.out.println(sheet.getRow(0).getCell(i).getStringCellValue());
		}
			
		}
		}
	}
	


