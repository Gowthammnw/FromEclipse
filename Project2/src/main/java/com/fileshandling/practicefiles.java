package com.fileshandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class practicefiles {
	
public static void main(String[] args) throws Exception {
	
	InputStream is = new FileInputStream("C:\\Users\\mahima\\Desktop\\sample.txt");
	int ch = is.read();
	
	while(ch!=-1) {
		System.out.print((char)(ch));
		ch=is.read();
	}
	is.close();
}
}

