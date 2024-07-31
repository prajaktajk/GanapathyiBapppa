package GenericUtils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.dataloader.Try;

public class dataProviderMethod {
	
	File f=new File("C:\\Users\\user\\eclipse-workspace\\Assessment\\src\\Framework\\tiFetchDataFromExcel.java");
    Workbook workbook=null;
    try {
    	FileInputStream fis=new FileInputStream(f);
    	workbook=WorkbookFactory.create(fis);
    }
    
    Catch (Exception e)
    {
    	
    }
    
  Sheet sheet=Workbook.getSheet("Sheet2");
  int rowCount=sheet.getPhysicalNumberOfCells();
  int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
  String[][]result= String[rowCount-1][cellCount];
  
  for(int i=1;i<rowCount;i++)
  {
	  for(int j=0;j<cellCount;j++)
	  {
		  String data=sheet.getRow(i).getCell.toString();
		  result[i-1][j]=data;
		  
	  }
  }
    return result;
    
}
}