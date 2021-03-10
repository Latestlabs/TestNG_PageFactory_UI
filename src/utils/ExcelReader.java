package utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	private static Workbook ExcelWorkbook=null;
	private static HashMap<Integer,List<String>> ExcelData= new HashMap<Integer,List<String>>();
	
	public ExcelReader(String FilePath) throws EncryptedDocumentException, IOException
	{
		ExcelWorkbook=WorkbookFactory.create(new File(FilePath));
	}
	
	public HashMap<Integer,List<String>> getValue(String SheetName,int Row,int Col)
	{
		int row=1;
		List<String> ColData=new LinkedList<String>();
		Sheet sheet=ExcelWorkbook.getSheet(SheetName);
		for(Row rowvalue:sheet)
		{
			
			for(Cell col:rowvalue)
			{
				ColData.add(col.getStringCellValue());
			}
			
			ExcelData.put(row, ColData);
			row++;
		}
		
		return ExcelData;
	}
	
	
	
	
}
