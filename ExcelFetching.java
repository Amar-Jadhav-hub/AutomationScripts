package testpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetching {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "C:\\Users\\jadha\\OneDrive\\Documents\\Book1.xlsx";

		FileInputStream file = new FileInputStream(path);

		String
		value1=WorkbookFactory.create(file).getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();

		System.out.println(value1);

		// double value1 =
		// WorkbookFactory.create(file).getSheet("UserDetails").getRow(1).getCell(0).getNumericCellValue();
		// System.out.println(value1);
	}

}