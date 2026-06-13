package Resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	
	public static String getCellData(String sheetName, int column, int rowNum) throws IOException
	{
	
		FileInputStream fis = new FileInputStream(
	            "C:\\Users\\admin\\eclipse-workspace\\Shopping_Cart\\testdata.xlsx");

	    XSSFWorkbook workbook = new XSSFWorkbook(fis);

	    XSSFSheet sheet = workbook.getSheet(sheetName);

	    Row row = sheet.getRow(rowNum);

	    Cell cell = row.getCell(column);

	    String value = "";

	    if (cell.getCellType() == CellType.STRING) {
	        value = cell.getStringCellValue();
	    } else if (cell.getCellType() == CellType.NUMERIC) {
	        value = NumberToTextConverter.toText(cell.getNumericCellValue());
	    }

	    workbook.close();

	    return value;
	}
	
}


