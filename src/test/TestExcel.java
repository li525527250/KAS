package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import cn.com.broad.excel.InsertExcel;

public class TestExcel {
	 public static void main(String[] args) throws FileNotFoundException, IOException {  
	        String path = "E:/test.xlsx";  
	        InputStream in = new FileInputStream(new File(path));  
	        InsertExcel.start(in,path);       
	    } 
}
