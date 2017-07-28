package readingFromFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelFile {
	public String[][] readExcel(String filePath, String sheetName) throws IOException{
		// Create an object of FileInputStream 
		FileInputStream inputStream = new FileInputStream(filePath);
		// reading from excel file
		// use ApachePOI
		Workbook workBook =null;
	
			// write the code to read form xlsx
			workBook = new XSSFWorkbook(inputStream);
		Sheet workSheet = workBook.getSheet(sheetName);
		int rowCount = workSheet.getLastRowNum() - workSheet.getFirstRowNum();
		String[][] dataFromExcel = new String[rowCount][2];
		for(int i =1; i < rowCount; i++){
			Row row = workSheet.getRow(i);
			dataFromExcel[i][0]= row.getCell(0).getStringCellValue();
			dataFromExcel[i][1]= row.getCell(1).getStringCellValue();

		}
		workBook.close();
		return dataFromExcel;

	}
	public static void main(String[] args) throws IOException{
		// THIS PROGRAM IS USED FOR READING DATA FROM EXCEL FILE 
		ReadDataFromExcelFile readExcelObject = new ReadDataFromExcelFile();
		String currentDir = System.getProperty("user.dir");
		String filePaht=currentDir + "\\src\\test\\java\\testData\\ExportExcel.xlsx";
		String[][] data =readExcelObject.readExcel(filePaht, "ExcelDemo");
		for(int j = 1 ; j< data.length; j++){
			System.out.println(data[j][0] + "----" + data[j][1]);
		}
		
	}

}
