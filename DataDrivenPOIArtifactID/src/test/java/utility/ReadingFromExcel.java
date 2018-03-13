package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {
	// method to read from excel file
	public static  String[][] readExcel(String filePaht, String sheetName, int startRow, int endRow, int startColumn, int endColumn) throws IOException{
		// creating an object to open the file
		File file = new File(filePaht);
		// use buffer reader 
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workBook = null;
		String fileExtensionName = filePaht.substring(filePaht.indexOf("."));
		// check up
		if(fileExtensionName.equals(".xlsx")){
			workBook = new XSSFWorkbook(inputStream);
		}
		Sheet workSheet = workBook.getSheet(sheetName);
		int rowSize = endRow - startRow + 1;
		int columnSize = endColumn - startColumn + 1; 
		String[][] dataFromExcel = new String[rowSize][columnSize];
		int currentRowNumber, currentColumnNumber;
		for(Row row : workSheet){
			currentRowNumber = row.getRowNum(); // will give you the current row, index type, start from 0
			if(currentRowNumber < startRow -1) continue;
			if(currentRowNumber > endRow -1) break; 

			for(Cell cell : row){
				currentColumnNumber =cell.getColumnIndex(); // will give you the current column index
				if(currentColumnNumber < startColumn -1) continue;
				if(currentColumnNumber > endColumn -1) break; 
				dataFromExcel[currentRowNumber - (startRow -1)][currentColumnNumber -(startColumn -1)] = cell.getStringCellValue();
				
			}
			
		}
		
		return dataFromExcel;
		
	}
	public static void main(String[] args) throws IOException{
		String result[][] = readExcel(utility.PathList.excelPath, "dataForLogin", 3, 10, 1, 2);
		for(int r =0; r< result.length; r++){
			System.out.println("-------------");
			for(int c=0; c< result[r].length; c++){
				System.out.print(".." + result[r][c]);
			}
		}
	}
	
}
