package com.actitime.Genericlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
 public String ReadDataFromProperty(String key) throws IOException {
	 FileInputStream fis = new FileInputStream("./testdata/commondat.property");
	 Properties p = new Properties();
	 p.load(fis);
	 String value = p.getProperty(key);
	 return value;
 }
 
 public String readdatafromexcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	 FileInputStream fis = new FileInputStream("./testdata/testdata.xlsx");
	 Workbook wb =WorkbookFactory.create(fis);
	 String value= wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	 return value;
 }
}
