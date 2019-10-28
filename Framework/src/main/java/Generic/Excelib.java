package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelib
{
	String path="C:\\Users\\Bishnu\\Desktop\\Exel.xlsx";
	public String getExceldata(String SheetName,int Rownum,int Colnum) throws Throwable
	{
	/*FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	XSSFRow r=ws.getRow(0);
	r.getCell(0).getStringCellValue();
	r.getCell(1).getStringCellValue();
	 /*r=ws.getRow(1);
	 System.out.println(r.getCell(0).getStringCellValue());
	 System.out.println(r.getCell(1).getStringCellValue());*/
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row rw=sh.getRow(Rownum);
		Cell cel=rw.getCell(Colnum);
		String data=cel.getStringCellValue();

		
		
	return data;
	
	
	}

}

