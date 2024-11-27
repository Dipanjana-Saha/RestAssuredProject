import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getData(String testcaseName) throws IOException {
		
		ArrayList<String> a= new ArrayList<String>();
		// TODO Auto-generated method stub
		//how to do u create file input stream
		//u have to pass an obj which have an access to read the file,so fileInputStream is aclass in java where it will create an obj which have a power to read any file.
		//so thats y we created a class and pass the path from which it has to read,so I have created fis obj which can create demodata filw and that obj is simly passing in workbook as fis
		FileInputStream fis=new FileInputStream("C:\\Users\\Dipanjana Saha\\Postman\\files\\demoDriven.xlsx");
		//now this has an ability to go inside this excel file becz of this fis obj,so this how u have to actually configure to make ur work book
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//once u got the access ,now u have to go to the desired sheet,now for example to have multiple sheet here,but u r interested in sheet 1 only
		//so how to tell ur workbook to go and read only sheet1
		//lets chcek the count oof sheets
		int sheets=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				
			
			XSSFSheet sheet=workbook.getSheetAt(i);
			
			//identify testcases column by scanning the entire 1st row
			//iterator gives all the rows of the sheet
			Iterator<Row> row=sheet.iterator();//shhet is collection of rows
			Row firstRow= row.next();
			Iterator<Cell> ce=firstRow.cellIterator();//row is collection of cells
			int k=0;
			int column=0;
			while(ce.hasNext()) {
				Cell value=ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("Data2")) {
					//desired column
					column =k;
					
				}
				k++;
			}
			System.out.println(column);
			while(row.hasNext()) {
				
				Row r=row.next();
				
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
					
					Iterator<Cell> cv= r.cellIterator();
					while(cv.hasNext()) {
						Cell c=cv.next();
						if(c.getCellType()==CellType.STRING)
						{
						a.add(c.getStringCellValue());
					}else {
						a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
					}
						
					}
				}
				
			}
			}
		}
		return a;

	}

	public static void main(String[] args) throws IOException {
		
			}

}
