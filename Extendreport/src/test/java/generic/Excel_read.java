package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_read {
	public static String getData(String sheet,int row,int cell) {
		String val="";
		try{
		FileInputStream fis=new FileInputStream("./Excel/demo.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
		val=c.getStringCellValue();
		
		
		
	}
		catch(Exception e){
			
		}
		return val;

}
}
