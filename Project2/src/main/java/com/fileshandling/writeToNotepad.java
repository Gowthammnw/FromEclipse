package com.fileshandling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class writeToNotepad {

	public static void main(String[] args) throws Exception {
		/*FileWriter mywrite = new FileWriter("C:\\Users\\mahima\\Desktop\\sample.txt");
		mywrite.write("hellow bhrarath sankar");
		mywrite.close();*/
		FileOutputStream mywrite = new FileOutputStream("C:\\Users\\mahima\\Desktop\\sample.txt");
		mywrite.write(65);
		mywrite.close();
		
	}
}
