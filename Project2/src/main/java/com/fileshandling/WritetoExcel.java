package com.fileshandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WritetoExcel {
	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet s0 = wb.createSheet();
		HSSFRow row0 = s0.createRow(0);
		HSSFCell cell0 = row0.createCell((short)0);
		cell0.setCellValue("welcome to java");
		wb.write(new FileOutputStream("C:\\Users\\mahima\\Documents\\abc.xls"));
		System.out.println("sucesss....");
	}

}
