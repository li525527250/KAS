package cn.com.broad.excel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import cn.com.broad.entity.Users;
import cn.com.broad.impl.UsersDaoImpl;

public class InsertExcel {
	public InsertExcel() {
	}

	public static void start(InputStream in, String path) throws FileNotFoundException, IOException {
		Workbook book = getWorkBook(in, path); // 1.获取工作簿
		List<Sheet> sheets = getSheets(book); // 2.获取所有工作表
		SheetIterator(sheets); // 3.对所有工作表进行操作
	}

	// 1.获取工作簿
	public static Workbook getWorkBook(InputStream in, String path) throws FileNotFoundException, IOException {
		return path.endsWith(".xls") ? (new HSSFWorkbook(in))
				: (path.endsWith(".xlsx") ? (new XSSFWorkbook(in)) : (null));
	}

	// 2.获取所有工作表
	private static List<Sheet> getSheets(Workbook book) {
		int numberOfSheets = book.getNumberOfSheets();
		List<Sheet> sheets = new ArrayList<Sheet>();
		for (int i = 0; i < numberOfSheets; i++) {
			sheets.add(book.getSheetAt(i));
		}
		return sheets;
	}

	// 3.对所有工作表进行操作
	private static void SheetIterator(List<Sheet> sheets) { 
        for (int i = 0; i < sheets.size(); i++) {    //循环每一张工作表  
            Sheet sheet = sheets.get(i);  
            if (sheet.getLastRowNum() >= 1) {    //判断是否为空表，获取有数据的最后一行的行数。如果为零则为空表  
                System.out.println(sheet.getSheetName() + "=============");     //打印不为空的工作表名字  
            }  
            Iterator<Row> iterator = sheet.iterator();   //迭代器  
            //用两个while循环遍历所有单元格  
            while (iterator.hasNext()) {           //遍历每一行  
                Row nextRow = iterator.next();  
                if (nextRow.getRowNum() < 1) {  
                    continue;      
                    //nextRow.getRowNum()就是获取行数，由表中看出第一行(getRowNum()=0)为表头，直接跳过  
                }  
                  
                //从第二行开始是有用的数据，要保存早数据库，第二行：nextRow.getRowNum()=1  s
                Iterator<Cell> cellIterator = nextRow.cellIterator();  
                Users course = new Users();  
                while (cellIterator.hasNext()) {         //遍历每一行的每一列  
                    Cell cell = cellIterator.next();  
                    switch(cell.getColumnIndex()){  
                    case 0:  
                        //将单元格内容设置为String类型，也可以这样写cell.setCellType(Cell.CELL_TYPE_STRING);  
                        cell.setCellType(1);    
                        course.setUserID(Integer.parseInt(cell.getStringCellValue()));  
                        break;  
                    case 1:   //第二列（系）  
                        cell.setCellType(1);    
                        course.setUserName(cell.getStringCellValue());  
                        break;  
                    case 2:   //第三列（课程）  
                        cell.setCellType(1);  
                        course.setUserPassword(cell.getStringCellValue());  
                        break;  
                    case 3:  
                        cell.setCellType(1);  
                        course.setAuthorityID(Integer.parseInt(cell.getStringCellValue()));  
                        break;  
					}
				}

				try {
					// 到这里已经遍历完一行Execl的所有单元格，并存储到model里面了，现在调用方法保存到数据库
					UsersDaoImpl usersDaoImpl = new UsersDaoImpl();
					usersDaoImpl.addUser(course);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

}