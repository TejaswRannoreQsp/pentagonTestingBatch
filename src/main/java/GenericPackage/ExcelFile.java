package GenericPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	public String toreadFromExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("\\src\\test\\resources\\DemoWebShop.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String testdata = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		return testdata;
		
	}

}
