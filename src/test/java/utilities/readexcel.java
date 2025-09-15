package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class readexcel {
	
	
	@DataProvider(name = "bvtdata")
	public static Object[][] getTestData() throws IOException {
	    String sheetName = "Sheet1";  // Hardcoded sheet name here

	    File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\testdata.xlsx");
	    FileInputStream fis = new FileInputStream(f);
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet(sheetName);

	    int totalRows = sheet.getLastRowNum();
	    int totalCols = sheet.getRow(0).getLastCellNum();

	    Object[][] testData = new Object[totalRows][totalCols];
	    DataFormatter formatter = new DataFormatter();

	    for (int i = 1; i <= totalRows; i++) {
	        Row row = sheet.getRow(i);
	        for (int j = 0; j < totalCols; j++) {
	            testData[i - 1][j] = formatter.formatCellValue(row.getCell(j));
	            System.out.println(testData[i - 1][j]);
	        }
	    }

	    wb.close();
	    fis.close();

	    return testData;
	}

    
}
