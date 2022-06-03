package Parameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		String Path ="C:\\Users\\RKENDRE\\Desktop\\Core Java\\19Febdata.xlsx";
		
		FileInputStream file= new FileInputStream(Path);

		
	    double data1	=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
		
	    System.out.println(data1);
		
		

	}

}
