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
		Workbook book = getWorkBook(in, path); // 1.��ȡ������
		List<Sheet> sheets = getSheets(book); // 2.��ȡ���й�����
		SheetIterator(sheets); // 3.�����й�������в���
	}

	// 1.��ȡ������
	public static Workbook getWorkBook(InputStream in, String path) throws FileNotFoundException, IOException {
		return path.endsWith(".xls") ? (new HSSFWorkbook(in))
				: (path.endsWith(".xlsx") ? (new XSSFWorkbook(in)) : (null));
	}

	// 2.��ȡ���й�����
	private static List<Sheet> getSheets(Workbook book) {
		int numberOfSheets = book.getNumberOfSheets();
		List<Sheet> sheets = new ArrayList<Sheet>();
		for (int i = 0; i < numberOfSheets; i++) {
			sheets.add(book.getSheetAt(i));
		}
		return sheets;
	}

	// 3.�����й�������в���
	private static void SheetIterator(List<Sheet> sheets) { 
        for (int i = 0; i < sheets.size(); i++) {    //ѭ��ÿһ�Ź�����  
            Sheet sheet = sheets.get(i);  
            if (sheet.getLastRowNum() >= 1) {    //�ж��Ƿ�Ϊ�ձ���ȡ�����ݵ����һ�е����������Ϊ����Ϊ�ձ�  
                System.out.println(sheet.getSheetName() + "=============");     //��ӡ��Ϊ�յĹ���������  
            }  
            Iterator<Row> iterator = sheet.iterator();   //������  
            //������whileѭ���������е�Ԫ��  
            while (iterator.hasNext()) {           //����ÿһ��  
                Row nextRow = iterator.next();  
                if (nextRow.getRowNum() < 1) {  
                    continue;      
                    //nextRow.getRowNum()���ǻ�ȡ�������ɱ��п�����һ��(getRowNum()=0)Ϊ��ͷ��ֱ������  
                }  
                  
                //�ӵڶ��п�ʼ�����õ����ݣ�Ҫ���������ݿ⣬�ڶ��У�nextRow.getRowNum()=1  s
                Iterator<Cell> cellIterator = nextRow.cellIterator();  
                Users course = new Users();  
                while (cellIterator.hasNext()) {         //����ÿһ�е�ÿһ��  
                    Cell cell = cellIterator.next();  
                    switch(cell.getColumnIndex()){  
                    case 0:  
                        //����Ԫ����������ΪString���ͣ�Ҳ��������дcell.setCellType(Cell.CELL_TYPE_STRING);  
                        cell.setCellType(1);    
                        course.setUserID(Integer.parseInt(cell.getStringCellValue()));  
                        break;  
                    case 1:   //�ڶ��У�ϵ��  
                        cell.setCellType(1);    
                        course.setUserName(cell.getStringCellValue());  
                        break;  
                    case 2:   //�����У��γ̣�  
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
					// �������Ѿ�������һ��Execl�����е�Ԫ�񣬲��洢��model�����ˣ����ڵ��÷������浽���ݿ�
					UsersDaoImpl usersDaoImpl = new UsersDaoImpl();
					usersDaoImpl.addUser(course);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

}